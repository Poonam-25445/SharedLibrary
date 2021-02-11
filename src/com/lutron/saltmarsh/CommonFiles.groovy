package com.lutron.saltmarsh

   def ZipFileName(String branchName, String zipPackageType) {
      return branchName.replace("/","-")+"-$zipPackageType"+".zip"
   }
