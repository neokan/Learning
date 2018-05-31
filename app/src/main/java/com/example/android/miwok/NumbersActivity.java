/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        /*
        ArrayList<String> arrayString = new ArrayList<String>();

        arrayString.add("one");
        arrayString.add("two");
        arrayString.add("three");
        arrayString.add("four");
        arrayString.add("five");
        arrayString.add("six");
        arrayString.add("seven");
        arrayString.add("eight");
        arrayString.add("nine");
        arrayString.add("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for(int index = 0 ; index < 10 ; index ++) {
            TextView wordView = new TextView(this);
            wordView.setText(arrayString.get(index));
            rootView.addView(wordView);
        }
        */

        /*
        String[] words = new String[10];

        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v("NumbersActivity","onCreate() - word at index 0: " + words[0]);
        Log.v("NumbersActivity","onCreate() - word at index 1: " + words[1]);
        */

    }
}
