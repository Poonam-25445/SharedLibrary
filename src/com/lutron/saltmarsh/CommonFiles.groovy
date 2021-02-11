package com.lutron.saltmarsh

public class CommonFiles {
   def ZipFileName(String branchName, String zipPackageType) {
      return branchName.replace("/","-")+"-$zipPackageType"+".zip"
   }
} 
