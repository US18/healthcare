package com.example.uplabdhisingh.t95.data;

import android.provider.BaseColumns;

/**
 * Created by uplabdhisingh on 17/02/18.
 */

public class HealthCareContract
{
    public static final class HealthCareEntry implements BaseColumns {
        public static final String TITLE_NAME="waitlist";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_TIME = "time";
        public static final String COLUMN_PINCODE = "pincode";
        public static final String COLUMN_RADIOGROUPS = "radiogroups";
        public static final String COLUMN_FOOD_CHECKBOX = "food_checkbox";
        public static final String COLUMN_FOOD_CHECKBOX = "food_checkbox";
        public static final String COLUMN_OTHERS = "others";

    }
}
