/*
 * Copyright (C) 2014 BeyondAR
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
package com.example.myxlab.beyondartest;

import android.annotation.SuppressLint;
import android.content.Context;

import com.beyondar.android.world.GeoObject;
import com.beyondar.android.world.World;

@SuppressLint("SdCardPath")
public class CustomWorldHelper {
    public static final int LIST_TYPE_EXAMPLE_1 = 1;

    public static World sharedWorld;

    ///////////
    private TrackGPS gps;
    double longitude;
    double latitude;


    public static World generateObjects(Context context) {
        if (sharedWorld != null) {
            return sharedWorld;
        }
        sharedWorld = new World(context);

        // The user can set the default bitmap. This is useful if you are
        // loading images form Internet and the connection get lost
        sharedWorld.setDefaultImage(R.drawable.beyondar_default_unknow_icon);

        // User position (you can change it using the GPS listeners form Android
        // API)
        //sharedWorld.setGeoPosition(2.918406d, 101.772073d);

		/*// Create an object with an image in the app resources.
        GeoObject go1 = new GeoObject(1l);
		go1.setGeoPosition(41.90523339794433d, 2.565036406654116d);
		go1.setImageResource(R.drawable.creature_1);
		go1.setName("Creature 1");

		// Is it also possible to load the image asynchronously form internet
		GeoObject go2 = new GeoObject(2l);
		go2.setGeoPosition(41.90518966360719d, 2.56582424468222d);
		go2.setImageUri("http://beyondar.github.io/beyondar/images/logo_512.png");
		go2.setName("Online image");

		// Also possible to get images from the SDcard
		GeoObject go3 = new GeoObject(3l);
		go3.setGeoPosition(41.90550959641445d, 2.565873388087619d);
		go3.setImageUri("/sdcard/someImageInYourSDcard.jpeg");
		go3.setName("IronMan from sdcard");

		// And the same goes for the app assets
		GeoObject go4 = new GeoObject(4l);
		go4.setGeoPosition(41.90518862002349d, 2.565662767707665d);
		go4.setImageUri("assets://creature_7.png");
		go4.setName("Image from assets");

		GeoObject go5 = new GeoObject(5l);
		go5.setGeoPosition(41.90553066234138d, 2.565777906882577d);
		go5.setImageResource(R.drawable.creature_5);
		go5.setName("Creature 5");

		GeoObject go6 = new GeoObject(6l);
		go6.setGeoPosition(41.90596218466268d, 2.565250806050688d);
		go6.setImageResource(R.drawable.creature_6);
		go6.setName("Creature 6");

		GeoObject go7 = new GeoObject(7l);
		go7.setGeoPosition(41.90581776104766d, 2.565932313852319d);
		go7.setImageResource(R.drawable.creature_2);
		go7.setName("Creature 2");

		GeoObject go8 = new GeoObject(8l);
		go8.setGeoPosition(41.90534261025682d, 2.566164369775198d);
		go8.setImageResource(R.drawable.rectangle);
		go8.setName("Object 8");

		GeoObject go9 = new GeoObject(9l);
		go9.setGeoPosition(41.90530734214473d, 2.565808038959814d);
		go9.setImageResource(R.drawable.creature_4);
		go9.setName("Creature 4");


		GeoObject go10 = new GeoObject(10l);
		go10.setGeoPosition(42.006667d, 2.705d);
		go10.setImageResource(R.drawable.object_stuff);
		go10.setName("Far away");

		// Add the GeoObjects to the world
		sharedWorld.addBeyondarObject(go1);
		sharedWorld.addBeyondarObject(go2, LIST_TYPE_EXAMPLE_1);
		sharedWorld.addBeyondarObject(go3);
		sharedWorld.addBeyondarObject(go4);
		sharedWorld.addBeyondarObject(go5);
		sharedWorld.addBeyondarObject(go6);
		sharedWorld.addBeyondarObject(go7);
		sharedWorld.addBeyondarObject(go8, 0);
		sharedWorld.addBeyondarObject(go9);
		sharedWorld.addBeyondarObject(go10);

		return sharedWorld;*/
/*		// Create an object with an image in the app resources.
		GeoObject go1 = new GeoObject(1l);
		go1.setGeoPosition(2.918367, 101.771693);
		go1.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go1.setName("Blok A");

		GeoObject go2 = new GeoObject(2l);
		go2.setGeoPosition(2.918590, 101.771814);
		go2.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go2.setName("Blok B");

		GeoObject go3 = new GeoObject(3l);
		go3.setGeoPosition(2.918406, 101.772073);
		go3.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go3.setName("Blok C");

		GeoObject go4 = new GeoObject(4l);
		go4.setGeoPosition(2.918172, 101.771869);
		go4.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go4.setName("Blok D");

		GeoObject go5 = new GeoObject(5l);
		go5.setGeoPosition(2.918172, 101.771486);
		go5.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go5.setName("Blok E");

		GeoObject go6 = new GeoObject(6l);
		go6.setGeoPosition(2.917840, 101.771512);
		go6.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go6.setName("Blok F");

		GeoObject go7 = new GeoObject(7l);
		go7.setGeoPosition(2.917899, 101.771081);
		go7.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go7.setName("Blok G");

		GeoObject go8 = new GeoObject(8l);
		go8.setGeoPosition(2.918306, 101.771022);
		go8.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go8.setName("Dewan Multimedia");

		GeoObject go9 = new GeoObject(9l);
		go9.setGeoPosition(2.918297, 101.772430);
		go9.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go9.setName("Dewan Kuliah");

		GeoObject go10 = new GeoObject(10l);
		go10.setGeoPosition(2.918257, 101.772596);
		go10.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go10.setName("Dataran IT");

		GeoObject go11 = new GeoObject(11l);
		go11.setGeoPosition(2.918229, 101.772720);
		go11.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go11.setName("Surau Kafetaria");

		GeoObject go12 = new GeoObject(12l);
		go12.setGeoPosition(2.918748, 101.771913);
		go12.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go12.setName("Carpark B");

		GeoObject go13 = new GeoObject(13l);
		go13.setGeoPosition(2.918651, 101.771364);
		go13.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go13.setName("Carpark A");

		GeoObject go14 = new GeoObject(14l);
		go14.setGeoPosition(2.918656, 101.772283);
		go14.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go14.setName("Motor Parking");

		GeoObject go15 = new GeoObject(14l);
		go15.setGeoPosition(2.917508, 101.771179);
		go15.setImageResource(R.drawable.creature_5);
//        go1.setImageUri("http://facinfo.comoj.com/assets/icon_B.png");
		go15.setName("Blok H");


//
		// Add the GeoObjects to the world
		sharedWorld.addBeyondarObject(go1);
//        sharedWorld.addBeyondarObject(go2, LIST_TYPE_EXAMPLE_1);
		sharedWorld.addBeyondarObject(go2, LIST_TYPE_EXAMPLE_1);
		sharedWorld.addBeyondarObject(go3);
		sharedWorld.addBeyondarObject(go4);
		sharedWorld.addBeyondarObject(go5);
		sharedWorld.addBeyondarObject(go6);
		sharedWorld.addBeyondarObject(go7);
		sharedWorld.addBeyondarObject(go8);
		sharedWorld.addBeyondarObject(go9);
		sharedWorld.addBeyondarObject(go10);
		sharedWorld.addBeyondarObject(go11);
		sharedWorld.addBeyondarObject(go12);
		sharedWorld.addBeyondarObject(go13);
		sharedWorld.addBeyondarObject(go14);
		sharedWorld.addBeyondarObject(go15);

		return sharedWorld;
	}*/

	/*public static World generateObjects(Context context) {
		if (sharedWorld != null) {
			return sharedWorld;
		}
		sharedWorld = new World(context);

		// The user can set the default bitmap. This is useful if you are
		// loading images form Internet and the connection get lost
		sharedWorld.setDefaultImage(R.drawable.beyondar_default_unknow_icon);

		// User position (you can change it using the GPS listeners form Android
		// API) //2.959851, 101.798757 kristalvilla
		sharedWorld.setGeoPosition(2.9186d, 101.7720099d);
				//2.998385d, 101.712090d);lab

		// Create an object with an image in the app resources.
		GeoObject go1 = new GeoObject(1l);
		go1.setGeoPosition(2.9184d, 101.772d);
		go1.setImageResource(R.drawable.creature_1);
		go1.setName("Creature 1");

		// Is it also possible to load the image asynchronously form internet
		GeoObject go2 = new GeoObject(2l);
		go2.setGeoPosition(2.9183d, 101.773d);
		go2.setImageUri("http://beyondar.github.io/beyondar/images/logo_512.png");
		go2.setName("Online image");

		// Also possible to get images from the SDcard
		GeoObject go3 = new GeoObject(3l);
		go3.setGeoPosition(2.9184d, 101.772d);
		go3.setImageUri("/sdcard/someImageInYourSDcard.jpeg");
		go3.setName("IronMan from sdcard");

		// And the same goes for the app assets
		GeoObject go4 = new GeoObject(4l);
		go4.setGeoPosition(2.9185d, 101.7725d);
		go4.setImageUri("assets://creature_7.png");
		go4.setName("Image from assets");

		GeoObject go5 = new GeoObject(5l);
		go5.setGeoPosition(2.9178d, 101.772000d);
		go5.setImageResource(R.drawable.creature_5);
		go5.setName("Creature 5");

		GeoObject go6 = new GeoObject(6l);
		go6.setGeoPosition(2.9178d, 101.772040d);
		go6.setImageResource(R.drawable.creature_6);
		go6.setName("Creature 6");

		GeoObject go7 = new GeoObject(7l);
		go7.setGeoPosition(2.9178d, 101.772080d);
		go7.setImageResource(R.drawable.creature_2);
		go7.setName("Creature 2");

		GeoObject go8 = new GeoObject(8l);
		go8.setGeoPosition(2.9185d, 101.7735d);
		go8.setImageResource(R.drawable.rectangle);
		go8.setName("Object 8");

		GeoObject go9 = new GeoObject(9l);
		go9.setGeoPosition(2.9177d, 101.77266d);
		go9.setImageResource(R.drawable.creature_4);
		go9.setName("Creature 4");
		
		
		GeoObject go10 = new GeoObject(10l);
		go10.setGeoPosition(2.918567d, 101.772999d);
		go10.setImageResource(R.drawable.object_stuff);
		go10.setName("Far away");
		
		// Add the GeoObjects to the world
		sharedWorld.addBeyondarObject(go1);
		sharedWorld.addBeyondarObject(go2, LIST_TYPE_EXAMPLE_1);
		sharedWorld.addBeyondarObject(go3);
		sharedWorld.addBeyondarObject(go4);
		sharedWorld.addBeyondarObject(go5);
		sharedWorld.addBeyondarObject(go6);
		sharedWorld.addBeyondarObject(go7);
		sharedWorld.addBeyondarObject(go8);
		sharedWorld.addBeyondarObject(go9);
		sharedWorld.addBeyondarObject(go10);

		return sharedWorld;
	}*/


        //original code4
        // User position (you can change it using the GPS listeners form Android
        // API)
        sharedWorld.setGeoPosition(41.90533734214473d, 2.565848038959814d);

        // Create an object with an image in the app resources.
        GeoObject go1 = new GeoObject(1l);
        go1.setGeoPosition(41.90523339794433d, 2.565036406654116d);
        go1.setImageResource(R.drawable.creature_1);
        go1.setName("Creature 1");

        // Is it also possible to load the image asynchronously form internet
        GeoObject go2 = new GeoObject(2l);
        go2.setGeoPosition(41.90518966360719d, 2.56582424468222d);
        go2.setImageUri("http://beyondar.github.io/beyondar/images/logo_512.png");
        go2.setName("Online image");

        // Also possible to get images from the SDcard
        GeoObject go3 = new GeoObject(3l);
        go3.setGeoPosition(41.90550959641445d, 2.565873388087619d);
        go3.setImageUri("/sdcard/someImageInYourSDcard.jpeg");
        go3.setName("IronMan from sdcard");

        // And the same goes for the app assets
        GeoObject go4 = new GeoObject(4l);
        go4.setGeoPosition(41.90518862002349d, 2.565662767707665d);
        go4.setImageUri("assets://creature_7.png");
        go4.setName("Image from assets");

        GeoObject go5 = new GeoObject(5l);
        go5.setGeoPosition(41.90553066234138d, 2.565777906882577d);
        go5.setImageResource(R.drawable.creature_5);
        go5.setName("Creature 5");

        GeoObject go6 = new GeoObject(6l);
        go6.setGeoPosition(41.90596218466268d, 2.565250806050688d);
        go6.setImageResource(R.drawable.creature_6);
        go6.setName("Creature 6");

        GeoObject go7 = new GeoObject(7l);
        go7.setGeoPosition(41.90581776104766d, 2.565932313852319d);
        go7.setImageResource(R.drawable.creature_2);
        go7.setName("Creature 2");

        GeoObject go8 = new GeoObject(8l);
        go8.setGeoPosition(41.90534261025682d, 2.566164369775198d);
        go8.setImageResource(R.drawable.rectangle);
        go8.setName("Object 8");

        GeoObject go9 = new GeoObject(9l);
        go9.setGeoPosition(41.90530734214473d, 2.565808038959814d);
        go9.setImageResource(R.drawable.creature_4);
        go9.setName("Creature 4");


        GeoObject go10 = new GeoObject(10l);
        go10.setGeoPosition(42.006667d, 2.705d);
        go10.setImageResource(R.drawable.object_stuff);
        go10.setName("Far away");

        // Add the GeoObjects to the world
        sharedWorld.addBeyondarObject(go1);
        sharedWorld.addBeyondarObject(go2, LIST_TYPE_EXAMPLE_1);
        sharedWorld.addBeyondarObject(go3);
        sharedWorld.addBeyondarObject(go4);
        sharedWorld.addBeyondarObject(go5);
        sharedWorld.addBeyondarObject(go6);
        sharedWorld.addBeyondarObject(go7);
        sharedWorld.addBeyondarObject(go8);
        sharedWorld.addBeyondarObject(go9);
        sharedWorld.addBeyondarObject(go10);

        return sharedWorld;
    }
}
