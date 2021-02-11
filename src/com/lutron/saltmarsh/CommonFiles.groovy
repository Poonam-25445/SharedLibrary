package com.lutron.saltmarsh

class CommonFiles {
   def ZipFileName(String branchName, String zipPackageType) {
      return branchName.replace("/","-")+"-$zipPackageType"+".zip"
   }
