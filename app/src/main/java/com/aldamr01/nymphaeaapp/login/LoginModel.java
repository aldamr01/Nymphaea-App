package com.aldamr01.nymphaeaapp.login;

public class LoginModel {

    private Integer status_code;
    private String message;
    private Data data;

    public Integer getStatus_code() { return status_code; }

    public void setStatus_code(Integer status_code) { this.status_code = status_code; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public Data getData() { return data; }

    public void setData(Data data) { this.data = data; }

    public class Data{
        private Integer user_id;
        private String token;
        private String email;
        private String company_name;
        private String csite_access;
        private String access_group;
        private Integer email_notification;

        public Integer getUser_id() { return user_id; }

        public void setUser_id(Integer user_id) { this.user_id = user_id; }

        public String getToken() { return token; }

        public void setToken(String token) { this.token = token; }

        public String getEmail() { return email; }

        public void setEmail(String email) { this.email = email; }

        public String getCompany_name() { return company_name; }

        public void setCompany_name(String company_name) { this.company_name = company_name; }

        public String getCsite_access() { return csite_access; }

        public void setCsite_access(String csite_access) { this.csite_access = csite_access; }

        public String getAccess_group() { return access_group; }

        public void setAccess_group(String access_group) { this.access_group = access_group; }

        public Integer getEmail_notification() { return email_notification; }

        public void setEmail_notification(Integer email_notification) { this.email_notification = email_notification; }
    }
}
