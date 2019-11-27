package com.aldamr01.nymphaeaapp.config;

public class URL {

    public static final String
        BASE_URL    = "http://192.168.1.4/",
//        BASE_URL    = "http://iotpond.sby.nusa.net.id/", // Server 1 Juga
//        BASE_URL    = "http://103.103.137.196/", // Server 1
        API_URL     = BASE_URL+"api/v1/",
        LOGIN       = API_URL+"authenticate",
        LOGOUT      = API_URL+"signout",

        URL_ALL_DEVICE      = API_URL+"device-list/",
        URL_DETAIL_DEVICE   = API_URL+"device-detail/",
        URL_UPDATE_DEVICE   = API_URL+"device-update/",
        URL_CREATE_DEVICE   = API_URL+"device-create/",
        URL_DELETE_DEVICE   = API_URL+"device-delete/",
        URL_REPORT_DEVICE   = API_URL+"device-report/",

        URL_ALL_POND_FILTERED   = API_URL+"pond-list-by-access/",
        URL_ALL_POND            = API_URL+"pond-list/",
        URL_DETAIL_POND         = API_URL+"pond-detail/",
        URL_UPDATE_POND         = API_URL+"pond-update/",
        URL_IDEAL_POND          = API_URL+"pond-update-ideal/",

        URL_CREATE_FISH_FEED        = API_URL+"pond-fish-feed/",
        URL_DELETE_FISH_FEED        = API_URL+"pond-fish-feed-delete/",
        URL_CREATE_FISH_DECEASED    = API_URL+"pond-fish-deceased/",
        URL_DELETE_FISH_DECEASED    = API_URL+"pond-fish-deceased-delete/"

    ;

}
