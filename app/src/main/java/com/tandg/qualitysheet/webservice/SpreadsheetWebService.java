package com.tandg.qualitysheet.webservice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpreadsheetWebService {

    @POST("1FAIpQLSdI43ATa34tXHnfTdPgs30LRtCQtBCUx5u7yQaPu0QZRZqqWA/formResponse")
    @FormUrlEncoded
    Call<Void> completeQualityQuestionnaire2(
            @Field("entry.880516821")  String workerId,
            @Field("entry.1430492217") String jobName,
            @Field("entry.373744288")  String auditorName,
            @Field("entry.389878221")  String houseNumber,
            @Field("entry.247279399")  String weekNumber,
            @Field("entry.668900209")  String workerName,
            @Field("entry.1994273709") String rowNumber,
            @Field("entry.1363445947") String qualityData1,
            @Field("entry.790697825")  String qualityData2,
            @Field("entry.1921784399") String qualityData3,
            @Field("entry.806686809")  String qualityData4,
            @Field("entry.1399381046") String comments,
            @Field("entry.1369821809") String qualityPercent
    );

    @POST("1FAIpQLSeehbNDewRheUlPc_4sDdZovYPi7gtFRgfKxB6NFAzAcawAOQ/formResponse")
    @FormUrlEncoded
    Call<Void> completeQualityQuestionnaireV2(
            @Field("entry.244611749")  String workerId,
            @Field("entry.65009985")   String jobName,
            @Field("entry.464471111")  String auditorName,
            @Field("entry.1437897825") String houseNumber,
            @Field("entry.758596555")  String weekNumber,
            @Field("entry.656363694")  String workerName,
            @Field("entry.1970838583") String adiCode,
            @Field("entry.228045673")  String rowNumber,
            @Field("entry.3369543")    String qualityData1,
            @Field("entry.1194597356") String qualityData2,
            @Field("entry.1541139899") String qualityData3,
            @Field("entry.2009671901") String qualityData4,
            @Field("entry.345942142")  String qualityData5,
            @Field("entry.376457338")  String qualityData6,
            @Field("entry.1681546794") String qualityData7,
            @Field("entry.1966572265") String qualityData8,
            @Field("entry.326396460")  String comments,
            @Field("entry.890572985")  String qualityPercent
    );

}
