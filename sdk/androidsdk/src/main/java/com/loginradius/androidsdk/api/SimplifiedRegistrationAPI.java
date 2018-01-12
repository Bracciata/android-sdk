package com.loginradius.androidsdk.api;

import com.google.gson.JsonObject;
import com.loginradius.androidsdk.helper.LoginRadiusSDK;
import com.loginradius.androidsdk.resource.QueryMapHelper;
import com.loginradius.androidsdk.handler.ApiInterface;
import com.loginradius.androidsdk.handler.AsyncHandler;
import com.loginradius.androidsdk.handler.ExceptionResponse;
import com.loginradius.androidsdk.handler.RestRequest;
import com.loginradius.androidsdk.resource.Endpoint;
import com.loginradius.androidsdk.resource.QueryParams;
import com.loginradius.androidsdk.response.login.LoginData;
import com.loginradius.androidsdk.response.phone.PhoneDataResponse;
import com.loginradius.androidsdk.response.register.RegisterResponse;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by loginradius on 13-Oct-17.
 */

public class SimplifiedRegistrationAPI {
    ApiInterface apiService = RestRequest.getClient().create(ApiInterface.class);

    public SimplifiedRegistrationAPI() {
        if (!LoginRadiusSDK.validate()) {
            throw new LoginRadiusSDK.InitializeException();
        }
    }
    public void simplifiedRegistrationByEmail(QueryParams queryParams, final AsyncHandler<RegisterResponse> handler) {
        apiService.getSimplifiedRegistrationByEmail(Endpoint.API_V2_SIMPLIFIED_REGISTRATION+"/email", QueryMapHelper.getMapSimplifiedRegistrationByEmail(queryParams)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(new DisposableObserver<RegisterResponse>() {
        @Override
        public void onComplete() {}

        @Override
        public void onError(Throwable e) {
            ExceptionResponse exceptionResponse = ExceptionResponse.HandleException(e);
            handler.onFailure(exceptionResponse.t, exceptionResponse.message);
        }

        @Override
        public void onNext(RegisterResponse response) {
            handler.onSuccess(response);
        }});}


    public void simplifiedRegistrationByPhone(QueryParams queryParams, final AsyncHandler<PhoneDataResponse> handler) {
        apiService.getSimplifiedRegistrationByPhone(Endpoint.API_V2_SIMPLIFIED_REGISTRATION+"/phone", QueryMapHelper.getMapSimplifiedRegistrationByPhone(queryParams)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<PhoneDataResponse>() {
                    @Override
                    public void onComplete() {}

                    @Override
                    public void onError(Throwable e) {
                        ExceptionResponse exceptionResponse = ExceptionResponse.HandleException(e);
                        handler.onFailure(exceptionResponse.t, exceptionResponse.message);
                    }

                    @Override
                    public void onNext(PhoneDataResponse response) {
                        handler.onSuccess(response);
                    }

                });}


    public void simplifiedRegistrationOtpVerification(QueryParams queryParams, JsonObject json, final AsyncHandler<LoginData> handler) {
        apiService.getSimplifiedRegistrationOtpVerification(Endpoint.API_V2_SIMPLIFIED_REGISTRATION+"/phone/verify", QueryMapHelper.getMapSimplifiedRegistrationOtpVerification(queryParams),json).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<LoginData>() {
                    @Override
                    public void onComplete() {}

                    @Override
                    public void onError(Throwable e) {
                        ExceptionResponse exceptionResponse = ExceptionResponse.HandleException(e);
                        handler.onFailure(exceptionResponse.t, exceptionResponse.message);
                    }

                    @Override
                    public void onNext(LoginData response) {
                        handler.onSuccess(response);
                    }

                });}
}
