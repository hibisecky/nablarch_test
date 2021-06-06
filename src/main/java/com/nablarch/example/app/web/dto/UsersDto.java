package com.nablarch.example.app.web.dto;

import com.nablarch.example.app.entity.SystemAccount;

import java.io.Serializable;

/**
 * ユーザ情報のDto
 *
 * @author Sekine Hibiki
 */
public class UsersDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ユーザID */
    private Integer userId;
    private String kanjiName;
    private String kanaName;
    private SystemAccount systemAccount;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * ユーザIDを取得する。
     * @return ユーザID
     */
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getKanjiName() {
        return kanjiName;
    }

    public void setKanjiName(String kanjiName) {
        this.kanjiName = kanjiName;
    }

    public String getKanaName() {
        return kanaName;
    }

    public void setKanaName(String kanaName) {
        this.kanaName = kanaName;
    }

    public SystemAccount getSystemAccount() {
        return systemAccount;
    }

    public void setSystemAccount(SystemAccount systemAccount) {
        this.systemAccount = systemAccount;
    }
}
