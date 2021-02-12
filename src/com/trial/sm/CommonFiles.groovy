package com.trial.sm


public class CommonFiles implements Artifactory {
   
	@Override
   public String getArtifactFileName(Map params) {
	   	  assert params: "params is required"
		  assert params.branchName: "branchName is required"
		  assert params.typeName: "typeName is required"
		  
		  return params.branchName.replace("/","-")+"-$params.typeName"+".zip323"
	 }
	 
	 @Override
	 public String getArtifactPath(Map params) {
		 assert params: "params is required"
		 assert params.repoPath: "repoPath is required"
		 assert params.branchName: "branchName is required"
		 
		 return params.repoPath + params.branchName.replace("/","%2F");
	 }
}
