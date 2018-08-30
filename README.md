# EasyTextToSpeach

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Aqil92:EasyTextSpeach:1.01'
	}
  
  
  For Activity
  Sound sound=Sound(this.getApplication());
  For Fragment
  Sound sound=Sound(getActivity().getApplication());
  
  sound.play("Hello world");
