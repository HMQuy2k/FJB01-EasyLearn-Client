package com.easy.learn.web.consts;

public interface ApiPath {
    String API = "/api/v1";

    //ping
    String PING = API + "/ping";

//    security
    String AUTHENTICATE = API + "/auth/authenticate";
    String REGISTER = API + "/auth/register";

    //user
    String USER_SIGN_IN = API + "/sign-in";
    String USER_GET_ALL = API + "/user/get-all";
    String USER_GET_UUID = API + "/user/get-by-uuid";
    String USER_CREATE = API + "/user/create";
    String USER_UPDATE = API + "/user/update";
    String USER_DELETE = API + "/user/delete";

    //    trainer
    String TRAINER_GET_ALL = API + "/trainer/get-all";
    String TRAINER_GET_ID = API + "/trainer/get-by-id";
    String TRAINER_CREATE = API + "/trainer/create";
    String TRAINER_UPDATE = API + "/trainer/get-update";
    String TRAINER_DELETE = API + "/trainer/delete";
    //    lesson
    String LESSON_GET_BY_COURSE_ID = API + "/lesson/get";


    // end
}
