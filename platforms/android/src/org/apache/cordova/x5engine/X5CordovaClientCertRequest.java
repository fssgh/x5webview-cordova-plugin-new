package org.apache.cordova.x5engine;


import com.tencent.smtt.export.external.interfaces.ClientCertRequest;

import org.apache.cordova.ICordovaClientCertRequest;

import android.annotation.SuppressLint;

import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;


public class X5CordovaClientCertRequest implements ICordovaClientCertRequest {

    private final ClientCertRequest request;

    public X5CordovaClientCertRequest(ClientCertRequest request) {
        this.request = request;
    }
    
    /**
     * Cancel this request
     */
    @SuppressLint("NewApi")
    public void cancel()
    {
        request.cancel();
    }
    
    /*
     * Returns the host name of the server requesting the certificate.
     */
    @SuppressLint("NewApi")
    public String getHost()
    {
        return request.getHost();
    }
    
    /*
     * Returns the acceptable types of asymmetric keys (can be null).
     */
    @SuppressLint("NewApi")
    public String[] getKeyTypes()
    {
        return request.getKeyTypes();
    }
    
    /*
     * Returns the port number of the server requesting the certificate.
     */
    @SuppressLint("NewApi")
    public int getPort()
    {
        return request.getPort();
    }
    
    /*
     * Returns the acceptable certificate issuers for the certificate matching the private key (can be null).
     */
    @SuppressLint("NewApi")
    public Principal[] getPrincipals()
    {
        return request.getPrincipals();
    }
    
    /*
     * Ignore the request for now. Do not remember user's choice.
     */
    @SuppressLint("NewApi")
    public void ignore()
    {
        request.ignore();
    }
    
    /*
     * Proceed with the specified private key and client certificate chain. Remember the user's positive choice and use it for future requests.
     * 
     * @param privateKey The privateKey
     * @param chain The certificate chain 
     */
    @SuppressLint("NewApi")
    public void proceed(PrivateKey privateKey, X509Certificate[] chain)
    {
        request.proceed(privateKey, chain);
    }
}
