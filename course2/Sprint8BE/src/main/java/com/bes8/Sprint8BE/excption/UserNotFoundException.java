package com.bes8.Sprint8BE.excption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND , reason = "User Not Found")
public class UserNotFoundException extends Exception{
}
