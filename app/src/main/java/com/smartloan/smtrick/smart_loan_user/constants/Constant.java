package com.smartloan.smtrick.smart_loan_user.constants;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.Calendar;

public class Constant {
    /************************************** Firebase Storage reference constants ***************************************************************************/
    public static final FirebaseStorage STORAGE = FirebaseStorage.getInstance();
    public static final StorageReference STORAGE_REFERENCE = STORAGE.getReference();
    private static final FirebaseDatabase DATABASE = FirebaseDatabase.getInstance();
    public static final DatabaseReference USER_TABLE_REF = DATABASE.getReference("users");
    public static final DatabaseReference LEEDS_TABLE_REF = DATABASE.getReference("leeds");
    public static final DatabaseReference INVOICE_TABLE_REF = DATABASE.getReference("invoice");
    public static final String DOCUMENTS_PATH = "images/documents";
    public static final String CUSROMER_PROFILE_PATH = "images/customer";
    public static final String USER_PROFILE_PATH = "images/user";
    /************************************** Firebase Authentication reference constants ***************************************************************************/
    public static final FirebaseAuth AUTH = FirebaseAuth.getInstance();
    /************************************** Calender Constatns ***************************************************************************/
    public static final Calendar cal = Calendar.getInstance();
    public static final int DAY = cal.get(Calendar.DAY_OF_MONTH);
    public static final int MONTH = cal.get(Calendar.MONTH);
    public static final int YEAR = cal.get(Calendar.YEAR);
    public static final String SUPPORT_PHONE_NUMBER = "+917030648899";
    public static String TWO_DIGIT_LIMIT = "%02d";
    public static String FOUR_DIGIT_LIMIT = "%04d";
    public static final String SUCCESS = "Success";
    public static final String MALE = "Male";
    public static final String FEMALE = "Female";
    public static final String AGENT = "AGENT";
    public static final String AGENT_PREFIX = "AG-";
    public static final String LEED_PREFIX = "L-";
    public static final String EMAIL_POSTFIX = "@smartloan.com";
    public static final String STORAGE_PATH = "STORAGE_PATH";
    public static final String BITMAP_IMG = "BITMAP_IMG";
    public static final String IMAGE_URI_LIST = "IMAGE_URI_LIST";
    public static final String CURRENT_PAGE = "CURRENT_PAGE";
    public static final String LEED_ID = "LEED_ID";
    public static final String IMAGE_COUNT = "IMAGE_COUNT";
    public static final String TOTAL_IMAGE_COUNT = "TOTAL_IMAGE_COUNT";
    public static final String LEED_MODEL = "LEED_MODEL";
    public static final String INVICES_LEEDS = "INVICES_LEEDS";
    //********************************************STATUS FLEADS*****************************
    public static final String STATUS_GENERATED = "GENERATED";
    public static final String STATUS_APPROVED = "APPROVED";
    public static final String STATUS_REJECTED = "REJECTED";
    public static final String STATUS_VERIFIED = "VERIFIED";
    public static final String STATUS_SUBMITED = "SUBMITED";

    public static final String STATUS_INPROCESS = "INPROCESS";
    public static final String STATUS_LOGIN = "LOGIN";
    public static final String STATUS_SANCTION = "SANCTION";
    public static final String STATUS_DOCPICKUP = "DOCUMENTS";
    public static final String STATUS_SUBMITEFORDISBUSS = "SUBMITEFORDISBUSS";
    public static final String STATUS_PARTIAL_DISBUSS = "PARTIAL_DISBUSS";
    public static final String STATUS_FULL_DISBUSS = "FULLDISBUSS";


    public static final String STATUS_IN_PROGRESS = "IN-PROGRESS";
    public static final String STATUS_SENT = "SENT";
    public static final String STATUS_PAID = "PAID";
    public static final String STATUS_UPDATED = "UPDATED";





    //***************************************************************************************
    public static final String GLOBAL_DATE_FORMATE = "dd MMM yyyy hh:mm a";
    public static final String CALANDER_DATE_FORMATE = "dd/MM/yy";
    public static final String LEED_DATE_FORMATE = "dd MMM, yyyy";
    public static final String DAY_DATE_FORMATE = "EEEE";
    public static final String TIME_DATE_FORMATE = "hh:mm a";
    public static final int REQUEST_CODE = 101;
    public static final int RESULT_CODE = 201;
    //****************************************************************
}
