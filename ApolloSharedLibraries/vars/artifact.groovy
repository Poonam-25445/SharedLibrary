 def getArtifactFileName(String branchName, String zipPackageType) {
      return branchName.replace("/","-")+"-$zipPackageType"+".zip"
 } 
