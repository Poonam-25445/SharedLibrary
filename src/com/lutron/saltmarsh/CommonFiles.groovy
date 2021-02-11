package com.lutron.saltmarsh

class CommonFiles {
   def ZipFileName(String branchName, String zipPackageType) {
      return branchName.replace("/","-")+"-$zipPackageType"+".zip"
   } 
	
   static void main(String[] args) {
      CommonFiles ex = new CommonFiles(); 
      println ex.ZipFileName('feature/pdf', 'artifacts')
   } 
}