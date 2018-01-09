package shiyanlou.struts;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;

public class UpLoadAction {

	private String uploader;

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	private File upload;

	private String uploadContentType;

	private String uploadFileName;

	private String savePath;

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String execute() throws Exception {

		String realpath = getSavePath();
		
		if (upload != null) {

			File savefile = new File(realpath, getUploadFileName());

			if (!savefile.getParentFile().exists()) {
				savefile.getParentFile().mkdirs();
			}

			FileUtils.copyFile(upload, savefile);

			ActionContext.getContext().put("message", "upload success");

			return "success";

		}

		return "error";

	}

}
