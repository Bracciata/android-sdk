package com.loginradius.androidsdk.handler;

import com.google.gson.JsonObject;
import com.loginradius.androidsdk.response.AccessTokenResponse;
import com.loginradius.androidsdk.response.CheckAvailability;
import com.loginradius.androidsdk.response.DeleteAccountResponse;
import com.loginradius.androidsdk.response.securityquestions.SecurityQuestionsResponse;
import com.loginradius.androidsdk.response.LoginRadiusContactCursorResponse;
import com.loginradius.androidsdk.response.PostAPIResponse;
import com.loginradius.androidsdk.response.UpdateResponse;
import com.loginradius.androidsdk.response.VerifyAutoLoginResponse;
import com.loginradius.androidsdk.response.VerifyEmailResponse;
import com.loginradius.androidsdk.response.album.LoginRadiusAlbum;
import com.loginradius.androidsdk.response.audio.LoginRadiusAudio;
import com.loginradius.androidsdk.response.checkin.LoginRadiusCheckIn;
import com.loginradius.androidsdk.response.company.LoginRadiusCompany;
import com.loginradius.androidsdk.response.config.ConfigResponse;
import com.loginradius.androidsdk.response.customobject.CreateCustomObject;
import com.loginradius.androidsdk.response.customobject.ReadCustomObject;
import com.loginradius.androidsdk.response.event.LoginRadiusEvent;
import com.loginradius.androidsdk.response.following.LoginRadiusFollowing;
import com.loginradius.androidsdk.response.group.LoginRadiusGroup;
import com.loginradius.androidsdk.response.like.LoginRadiusLike;
import com.loginradius.androidsdk.response.login.LoginData;
import com.loginradius.androidsdk.response.mention.LoginRadiusMention;
import com.loginradius.androidsdk.response.page.LoginRadiusPage;
import com.loginradius.androidsdk.response.password.ForgotPasswordResponse;
import com.loginradius.androidsdk.response.phone.PhoneDataResponse;
import com.loginradius.androidsdk.response.phone.PhoneForgotPasswordResponse;
import com.loginradius.androidsdk.response.phone.PhoneResponse;
import com.loginradius.androidsdk.response.phonesendotp.PhoneSendOtpData;
import com.loginradius.androidsdk.response.photo.LoginRadiusPhoto;
import com.loginradius.androidsdk.response.post.LoginRadiusPost;
import com.loginradius.androidsdk.response.register.DeleteResponse;
import com.loginradius.androidsdk.response.register.RegisterResponse;
import com.loginradius.androidsdk.response.register.RegistrationData;
import com.loginradius.androidsdk.response.securityquestions.UpdateSecurityQuestionsResponse;
import com.loginradius.androidsdk.response.socialinterface.SocialInterface;
import com.loginradius.androidsdk.response.status.LoginRadiusStatus;
import com.loginradius.androidsdk.response.traditionalinterface.UserRegistration;
import com.loginradius.androidsdk.response.userprofile.LoginRadiusUltimateUserProfile;
import com.loginradius.androidsdk.response.video.LoginRadiusVideo;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by loginradius on 29-May-17.
 */

public interface ApiInterface {


    /**
     * Retrofit2 with RxJava GET
     */


    @GET
    Observable<LoginRadiusUltimateUserProfile> getUserProfile(@Url String url, @QueryMap Map<String,String> options);


    @GET
    Observable<LoginRadiusAlbum[]> getAlbum(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusAudio[]> getAudio(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusCheckIn[]> getCheckin(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusCompany[]> getCompany(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusContactCursorResponse> getContact(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusEvent[]> getEvent(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusFollowing[]> getFollowing(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusGroup[]> getGroup(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusLike[]> getLike(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusMention[]> getMention(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusPhoto[]> getPhoto(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<LoginRadiusPost[]> getPost(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusStatus[]> getStatus(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusVideo[]> getVideo(@Url String url, @Query("access_token") String access_token);


    @GET
    Observable<LoginRadiusPage> getPage(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<SocialInterface> getSocialProviderInterface(@Url String url);


    @GET
    Observable<List<UserRegistration>>getTraditionalInterface(@Url String url);


    @GET
    Observable<AccessTokenResponse> getNativeLogin(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<LoginData> getTraditionalLogin(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<ConfigResponse> getConfiguration(@Url String url, @Query("apikey") String apikey);

    @POST
    Observable<LoginData> getTraditionalLogin(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject value);


    @GET
    Observable<LoginRadiusUltimateUserProfile> getSocialProfile(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<CreateCustomObject> getReadCustomobjectById(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<ReadCustomObject> getReadCustomobjectByToken(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<RegisterResponse> getEmailPromptAutoLogin(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<LoginData> getEmailPromptAutoLoginPing(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<VerifyAutoLoginResponse> getVerifyAutoLoginEmail(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<VerifyEmailResponse> getVerifyEmail(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<AccessTokenResponse> getValidateAccessToken(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<RegisterResponse> getInvalidateAccessToken(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<CheckAvailability> getUsernameAvailability(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<CheckAvailability> getEmailAvailability(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<CheckAvailability> getPhoneNumberAvailability(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<PhoneSendOtpData> getphonesendOtp(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<RegisterResponse> getSimplifiedRegistrationByEmail(@Url String url, @QueryMap Map<String, String> options);


    @GET
    Observable<PhoneDataResponse> getSimplifiedRegistrationByPhone(@Url String url, @QueryMap Map<String, String> options);


    @PUT
    Observable<LoginData> getSimplifiedRegistrationOtpVerification(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @GET
    Observable<SecurityQuestionsResponse[]> getSecurityQuestions(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<UpdateResponse> getDeleteAccount(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<LoginRadiusUltimateUserProfile> getReadAllUserProfile(@Url String url, @QueryMap Map<String, String> options);

    @GET
    Observable<UpdateResponse> getInstantLogin(@Url String url, @QueryMap Map<String,String> options);

    @GET
    Observable<LoginData> getInstantLoginVerify(@Url String url, @QueryMap Map<String,String> options);

    @POST
    Observable<PostAPIResponse> getMessage(@Url String url, @QueryMap Map<String, String> options);


    @POST
    Observable<PostAPIResponse> getStatusUpdate(@Url String url, @QueryMap Map<String, String> options);


    @POST
    Observable<RegisterResponse> getTraditionalRegister(@Url String url, @HeaderMap Map<String, String> headers, @QueryMap Map<String, String> options, @Body RegistrationData data);

    @POST
    Observable<RegisterResponse> getTraditionalRegister(@Url String url, @HeaderMap Map<String, String> headers, @QueryMap Map<String, String> options, @Body JsonObject data);


    @POST
    Observable<ForgotPasswordResponse> getForgotPasswordByEmail(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @POST
    Observable<PhoneForgotPasswordResponse> getForgotPasswordByPhone(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @POST
    Observable<RegisterResponse> getResendotp(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @POST
    Observable<PhoneResponse> getResendotpbytoken(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @POST
    Observable<RegisterResponse> getAddEmail(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @POST
    Observable<CreateCustomObject> getCreateCustomObject(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @PUT
    Observable<RegisterResponse> getChangePassword(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @PUT
    Observable<PhoneResponse> getUpdatephone(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);

    @PUT
    Observable<RegisterResponse> getUpdateprofile(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);

    @PUT
    Observable<RegisterResponse> getUpdateprofile(@Url String url, @QueryMap Map<String, String> options, @Body RegistrationData data);


    @PUT
    Observable<LoginData> getOtpVerification(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);

    @PUT
    Observable<RegisterResponse> getResetPasswordByOtp(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);

    @PUT
    Observable<RegisterResponse> getLinking(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @PUT
    Observable<RegisterResponse> getResendEmailVerification(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @PUT
    Observable<CreateCustomObject> getUpdateCustomObject(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);

    @PUT
    Observable<UpdateResponse> getUpdateUsername(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);

    @PUT
    Observable<RegisterResponse> getVerifyOtp(@Url String url, @QueryMap Map<String, String> options);


    @PUT
    Observable<RegisterResponse> getResetPasswordbySecurityQuestion(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);

    @PUT
    Observable<UpdateResponse> getResetPasswordByResetToken(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);

    @PUT
    Observable<UpdateSecurityQuestionsResponse> getUpdateSecurityQuestionByAccessToken(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @HTTP(method = "DELETE",hasBody = true)
    Observable<DeleteResponse> getRemoveEmail(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject data);


    @HTTP(method = "DELETE",hasBody = true)
    Observable<DeleteResponse> getUnlinking(@Url String url, @QueryMap Map<String, String> options, @Body JsonObject jsonObject);


    @DELETE
    Observable<DeleteResponse> getDeleteCustomObject(@Url String url, @QueryMap Map<String, String> options);

    @DELETE
    Observable<DeleteAccountResponse> getDeleteAccountByConfirmEmail(@Url String url, @QueryMap Map<String, String> options);
}
