CustomFont
==========
This library let you apply custom fonts to your android projects it's very simple to use just
change the widget declaration on your layout the library will find the font on your assets directory

Limitations
=========
- The font must be a .ttf font
- The font must be on your Assets folder


Sample:
=========
```xml
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >

    <com.github.leonardoxh.customfont.FontText
        android:text="@string/hello_world"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:font="Roboto" />

</RelativeLayout>

```

Also you can apply the font to any of your custom components to using the <code>FontUtils.applyFont(Context, TextView, String)</code> :)

Gradle:
=========
```groovy
dependencies {
    compile 'com.github.leonardoxh:custom-font:1.2'
}
```

Licence:
==========
```
Copyright 2013-2014 Leonardo Rossetto

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
