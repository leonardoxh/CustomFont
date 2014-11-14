/*
 * Copyright 2013-2014 Leonardo Rossetto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.leonardoxh.customfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

public final class FontUtils {

    static void applyFont(Context context, TextView textView, AttributeSet attrs) {
        TypedArray style = context.obtainStyledAttributes(attrs, R.styleable.font);
        applyFont(context, textView, style.getString(R.styleable.font_fontNormal));
        style.recycle();
    }

    public static boolean applyFont(Context context, TextView textView, String font) {
        if(TextUtils.isEmpty(font)) {
            throw new RuntimeException("The font can't be null");
        }
        try {
            textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/" + font + ".ttf"));
            return true;
        } catch(Exception e) {
            Log.w("FontRadioButton", "Error to obtain the font: " + font, e);
        }
        return false;
    }

}