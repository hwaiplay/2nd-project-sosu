package second.sosu.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
//@Component어노테이션을 이용하여 이 객체의 관리를 스프링이 담당
@Component("fileUtils")
public class FileUtils {
	private static final String filePath = "/resources/upload/";
	
	public List<Map<String,Object>> parseInsertFileInfo(Map<String,Object> map, HttpServletRequest request) throws Exception{
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
    	Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
    	
    	MultipartFile multipartFile = null;
    	String originalFileName = null;
    	String originalFileExtension = null;
    	String storedFileName = null;
    	
    	List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        Map<String, Object> listMap = null; 
        
        String cp_board_idx = (String)map.get("CAFE_IDX");
        String goodsreg_idx = (String)map.get("GOODSREG_IDX");
        
        String rootPath = multipartHttpServletRequest.getSession().getServletContext().getRealPath(filePath);
        File file = new File(rootPath);
        if(file.exists() == false){
        	file.mkdirs();
        }
        
        while(iterator.hasNext()){
        	multipartFile = multipartHttpServletRequest.getFile(iterator.next());
        	if(multipartFile.isEmpty() == false){
        		originalFileName = multipartFile.getOriginalFilename();
        												//()에 주어진 인덱스부터 끝까지의 문자열을 리턴 ex) .jpg
        		originalFileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
        																			//마지막에 나오는 .의 인덱스 위치를 보고
        		storedFileName = CommonUtils.getRandomString() + originalFileExtension;
        		
        		file = new File(rootPath + "/" + storedFileName);
        		multipartFile.transferTo(file);
        		
        		listMap = new HashMap<String,Object>();
        		listMap.put("CP_BOARD_IDX", cp_board_idx);
        		listMap.put("GOODSREG_IDX", goodsreg_idx);
        		listMap.put("CP_ORIGINAL_FILE_NAME", originalFileName);
        		listMap.put("CP_STORED_FILE_NAME", storedFileName);
        		listMap.put("CP_FILE_SIZE", multipartFile.getSize());
        		list.add(listMap);
        	}
        }
		return list;
	}

	public List<Map<String, Object>> parseUpdateFileInfo(Map<String, Object> map, HttpServletRequest request) throws Exception {
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
		Iterator<String> iterator = multipartHttpServletRequest.getFileNames();  //Iterator객체생성
		
		MultipartFile multipartFile = null;
		String originalFileName = null;
		String originalFileExtension = null;
		String storedFileName = null;
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String, Object> listMap = null; 
		
        String cp_board_idx = (String)map.get("CAFE_IDX");
        String goodsreg_idx = (String)map.get("GOODSREG_IDX");
		String requestName = null;
		String idx = null;
		
		String rootPath = multipartHttpServletRequest.getSession().getServletContext().getRealPath(filePath);
		
		
		while(iterator.hasNext()){
			multipartFile = multipartHttpServletRequest.getFile(iterator.next());
			if(multipartFile.isEmpty() == false){
				originalFileName = multipartFile.getOriginalFilename();
				originalFileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));  //확장자만 떼어놓았다가
				storedFileName = CommonUtils.getRandomString() + originalFileExtension;   //다시 붙이기
				
				multipartFile.transferTo(new File(rootPath + storedFileName));
				
				listMap = new HashMap<String,Object>();
				listMap.put("IS_NEW", "Y");
        		listMap.put("CP_BOARD_IDX", cp_board_idx);
        		listMap.put("GOODSREG_IDX", goodsreg_idx);
        		listMap.put("CP_ORIGINAL_FILE_NAME", originalFileName);
        		listMap.put("CP_STORED_FILE_NAME", storedFileName);
        		listMap.put("CP_FILE_SIZE", multipartFile.getSize());
				list.add(listMap);
			}
			else{
				requestName = multipartFile.getName();	//html태그에서 file태그의 name값을 가져온다.
				idx = "CP_IDX_"+requestName.substring(requestName.indexOf("_")+1);
				if(map.containsKey(idx) == true && map.get(idx) != null){
					listMap = new HashMap<String,Object>();
					listMap.put("IS_NEW", "N");
					listMap.put("FILE_IDX", map.get(idx));
					list.add(listMap);
				}
			}
		}
		return list;
	
	}
}















