package com.daytightchunks.scootfinder01;

/**
 * Created by DayTightChunks on 26/12/2016.
 */

public class Moto {

    /**
     * State
     */
    private String mLicencePlate;
    private String mAddress;
    private String mMotoID;
    private String mDistance;
    private String mBatteryLevel;
    private int mMotoIconID;
    private int mBatteryIconID;

    /**
     * Constructor
     * Defines how the class will be instantiated
     */

    public Moto(String plate, String address, String motoID, String distance, String battery, int motoIconID, int batteryIconID) {
        mLicencePlate = plate;
        mAddress = address;
        mMotoID = motoID;
        mDistance = distance;
        mBatteryLevel = battery;
        mMotoIconID = motoIconID;
        mBatteryIconID = batteryIconID;
    }

    /**
     * Methods
     */
    public String getLicencePlate() { return mLicencePlate; }
    public String getAddress() { return mAddress; }
    public String getMotoID() { return mMotoID; }
    public String getDistance() { return mDistance; }
    public String getBatteryLevel() { return mBatteryLevel; }

    public int getMotoIconID() { return mMotoIconID; }
    public int getBatteryIconID() { return mBatteryIconID; }
}
