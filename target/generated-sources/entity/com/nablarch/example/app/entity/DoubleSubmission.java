package com.nablarch.example.app.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 二重サブミット管理
 *
 */
@Generated("GSP")
@Entity
@Table(schema = "PUBLIC", name = "DOUBLE_SUBMISSION")
public class DoubleSubmission implements Serializable {

    private static final long serialVersionUID = 1L;

    /** トークン */
    private String token;

    /** 作成日時 */
    private Date createdAt;
    /**
     * トークンを返します。
     *
     * @return トークン
     */
    @Id
    @Column(name = "TOKEN", length = 36, nullable = false, unique = true)
    public String getToken() {
        return token;
    }

    /**
     * トークンを設定します。
     *
     * @param token トークン
     */
    public void setToken(String token) {
        this.token = token;
    }
    /**
     * 作成日時を返します。
     *
     * @return 作成日時
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_AT", nullable = true, unique = false)
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 作成日時を設定します。
     *
     * @param createdAt 作成日時
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
