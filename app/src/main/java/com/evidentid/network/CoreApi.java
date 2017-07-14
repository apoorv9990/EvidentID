package com.evidentid.network;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by patel on 7/13/2017.
 */

public interface CoreApi {

    @GET("history_" + "{YYYY}" + "{MM}" + "{DD}" + "/q/" + "{state}/"+"{city}"+".json")
    public void getHistory(@Path("YYYY") String year,
                           @Path("MM") String month,
                           @Path("DD") String date,
                           @Path("state") String state,
                           @Path("city") String city);
}
