package shiyanlou.struts;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;

public class MultiUpLoadFile {

	private File[] uploads;
	
	private String[] uploadsContentType;
	
	private String[] uploadsFileName;
	
	private String savePath;

	public File[] getUploads() {
		return uploads;
	}

	public void setUploads(File[] uploads) {
		this.uploads = uploads;
	}

	public String[] getUploadsContentType() {
		return uploadsContentType;
	}

	public void setUploadsContentType(String[] uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}

	public String[] getUploadsFileName() {
		return uploadsFileName;
	}

	public void setUploadsFileName(String[] uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
	public String execute() throws Exception{
		
		String realPath = getSavePath();
		
		if(uploads != null){
			
			File savepath = new File(realPath);
			
			if(!savepath.exists()){
				savepath.mkdirs();
			}
			
			for (int i = 0; i < uploads.length; i++) {
				File savefile = new File(savepath, getUploadsFileName()[i]);
				FileUtils.copyFile(uploads[i], savefile);
			}
			
			ActionContext.getContext().put("message", "upload succeed!!!");
			return "success";
		}
		return "error";
		
	}
	
}
