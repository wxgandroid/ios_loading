# myutils
## 1.在project的build.gradle下添加
` 
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
`
## 2.在module的build.gradle中添加
`
dependencies {
	        implementation 'com.github.wxgandroid:iosloading:v1.0'
	}
`
## 3.代码中使用
`
IosLoadingDialog dialog = new IosLoadingDialog.Builder(this)
                        .setCancelOnTouchOutsite(true)
                        .build();
                dialog.show();
`
