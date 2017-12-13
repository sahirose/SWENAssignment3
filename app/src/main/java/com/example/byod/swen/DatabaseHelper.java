package com.example.byod.swen;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by byod on 08-Dec-17.
 */



    public class DatabaseHelper extends SQLiteOpenHelper {

        public static final String DATABASE_NAME = "student.db";
        public static final String TABLE_NAME = "student_table";
        public static final String COLUMN_1 = "Id";
        public static final String COLUMN_2 = "Username";
        public static final String COLUMN_3 = "Password";



    public static final String CheckTable="checkTiming";
    public static final String Timing_ID="ID";
    public static final String CheckIn="checkin";
    public static final String checkOut="checkOut";

    public static final String ReviewTable="review";
    public static final String ReviewID="ID";
    public static final String ReviewDate="RDate";
    public static final String Review="Review";

    public static final String CustomerTable="CustTable";
    public static final String customerID="ID";
    public static final String CustomerName="CName";
    public static final String CustomerNRIC="NRIC";
    public static final String CustomerGender="Gender";
    public static final String CustomerAddress="Address";
    public static final String CustomerContact="ContactNo";
    public static final String CustomerEmail="Email";
    public static final String CustomerRequest="CRequest";

    public static final String RoomTable="RoomTable";
    public static final String RoomType="RoomType";
    public static final String RoomNo="RoomNO";
    public static final String RoomStatus="RoomStatus";
    public static final String RoomTotalAmount="RoomTotalAmount";
    public static final String RoomAdditionalFees="RoomAdditionalFees";
    public static final String RoomMemo="RoomMemo";
    public static final String RoomID="RoomID";






    public DatabaseHelper(Context context) {
            // database is created when consutrctor is called.
            super(context, DATABASE_NAME, null, 1);
            // to invoke onCreate() and onUpgrade() methods to create the tables
            SQLiteDatabase db = this.getWritableDatabase();

        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table " + TABLE_NAME + "("
                    + COLUMN_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COLUMN_2 + " TEXT, "
                    + COLUMN_3 + " TEXT )"

            );
                    db.execSQL("create table " + CheckTable + "("
                            + Timing_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
                            + CheckIn +" DATE, "
                            + checkOut+" DATE)"
                    );

            db.execSQL("create table " + ReviewTable + "("
                    + ReviewID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + ReviewDate +" DATE, "
                    + Review+" TEXT)"
            );

            db.execSQL("create table " + CustomerTable + "("
                    + customerID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + CustomerName +" TEXT, "
                    + CustomerNRIC+" TEXT, "
                    + CustomerGender+" TEXT, "
                    + CustomerAddress +  "TEXT,"
                    + CustomerContact + "INT,"
                    + CustomerEmail + "Email,"
                    + CustomerRequest + "TEXT)"
            );

            db.execSQL("create table " + ReviewTable + "("
                    + ReviewID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + ReviewDate +" DATE, "
                    + Review+" TEXT)"
            );

            db.execSQL("create table " + RoomTable + "("
                    +RoomID +" INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + RoomType +" TEXT, "
                    + RoomNo +" INTEGER, "
                    + RoomTotalAmount +" INTEGER, "
                    + RoomAdditionalFees +" INTEGER, "
                    + RoomMemo+" TEXT)"
                    + RoomStatus+" TEXT)"

            );


        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            db.execSQL("DROP TABLE IF EXISTS "+ CheckTable);
            db.execSQL("DROP TABLE IF EXISTS "+ ReviewTable);
            db.execSQL("DROP TABLE IF EXISTS "+ CustomerTable);
            db.execSQL("DROP TABLE IF EXISTS "+ RoomTable);
            onCreate(db);

        }

        public boolean insertData(String username, String password) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COLUMN_2, username);
            contentValues.put(COLUMN_3, password);
            long result = db.insert(TABLE_NAME, null, contentValues);
            if (result == -1)
                return false;
            else
                return true;
        }

        // check if username and password is in the database
        public boolean Search(String user, String pass) {
            String selectQuery = "select * from  " + TABLE_NAME + " where " + COLUMN_2 + " = " + "'" + user + "'" + " and " + COLUMN_3 + " = " + "'" + pass + "'";

            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.rawQuery(selectQuery, null);

            cursor.moveToFirst();
            if (cursor.getCount() > 0) {

                return true;
            }
            cursor.close();
            db.close();

            return false;
        }

    public static String getTiming_ID() {
        return Timing_ID;
    }

    public static String getCheckIn() {
        return CheckIn;
    }

    public static String getCheckOut() {
        return checkOut;
    }

    public static String getReviewID() {
        return ReviewID;
    }

    public static String getReviewDate() {
        return ReviewDate;
    }

    public static String getReview() {
        return Review;
    }

    public static String getCustomerID() {
        return customerID;
    }

    public static String getCustomerName() {
        return CustomerName;
    }

    public static String getCustomerNRIC() {
        return CustomerNRIC;
    }

    public static String getCustomerAddress() {
        return CustomerAddress;
    }

    public static String getCustomerContact() {
        return CustomerContact;
    }

    public static String getCustomerEmail() {
        return CustomerEmail;
    }

    public static String getCustomerRequest() {
        return CustomerRequest;
    }

    public static String getRoomID() {
        return RoomID;
    }

    public static String getRoomNo() {
        return RoomNo;
    }

    public static String getRoomStatus() {
        return RoomStatus;
    }

    public Cursor getAllCheckData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("SELECT * FROM " + CheckTable, null);
        return results;
    }
    public Cursor getAllReviewData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("SELECT * FROM " + Review, null);
        return results;
    }
    public Cursor getAllCustData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("SELECT * FROM " + CustomerTable, null);
        return results;
    }

    public Cursor getAllRoomData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("SELECT * FROM " + RoomTable, null);
        return results;
    }

    public boolean insertCustData(String name, String IC, String Address, String Contact, String Email )
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CustomerName, name);
        contentValues.put(CustomerNRIC, IC);
        contentValues.put(CustomerAddress, Address);
        contentValues.put(CustomerContact,Integer.parseInt(Contact));
        contentValues.put(CustomerEmail, Email);
        long result = db.insert(CustomerTable, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertSpecialData(String name ,String special ) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CustomerName, name);
        contentValues.put(CustomerRequest, special);
        long result = db.insert(CustomerTable, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean insertRoomData( String number, String Status)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(RoomNo, number);
        contentValues.put(RoomStatus, Status);
        long result = db.insert(CustomerTable, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean insertReviewData( String date, String review)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ReviewDate, date);
        contentValues.put(Review, review);
        long result = db.insert(CustomerTable, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertCheckData( String checkIn, String checkout)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CheckIn, checkIn);
        contentValues.put(checkOut, checkout);
        long result = db.insert(CustomerTable, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }





}



