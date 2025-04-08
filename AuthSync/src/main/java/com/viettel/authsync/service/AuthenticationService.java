package com.viettel.authsync.service;

import java.text.ParseException;

import com.nimbusds.jose.*;
import com.viettel.authsync.dto.request.AuthenticationRequest;
import com.viettel.authsync.dto.request.IntrospectRequest;
import com.viettel.authsync.dto.request.LogoutRequest;
import com.viettel.authsync.dto.request.RefreshRequest;
import com.viettel.authsync.dto.response.AuthenticationResponse;
import com.viettel.authsync.dto.response.IntrospectResponse;

public interface AuthenticationService {
    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;

    AuthenticationResponse authenticate(AuthenticationRequest request);

    void logout(LogoutRequest request) throws ParseException, JOSEException;

    AuthenticationResponse refreshToken(RefreshRequest request) throws ParseException, JOSEException;
}
