 def getArtifactFileName(String branchName, String zipPackageType) {
      return branchName.replace("/","-")+"-$zipPackageType"+".zip"
 } 
	
println getArtifactFileName('feature/pdf', 'artifacts')
