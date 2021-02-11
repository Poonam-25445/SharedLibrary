package com.lutron.saltmarsh

 def getArtifactFileName(String branchName, String zipPackageType) {
      return branchName.replace("/","-")+"-$zipPackageType"+".zip"
 } 
