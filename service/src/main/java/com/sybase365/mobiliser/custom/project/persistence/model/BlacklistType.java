/**
 * Copyright (C) 2012-2015 SAP SE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sybase365.mobiliser.custom.project.persistence.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sybase365.mobiliser.framework.persistence.model.DbEntry;
import com.sybase365.mobiliser.framework.persistence.model.NamedLookUpEntry;

/**
 * @since 2012-02-03
 */
@Entity
@Table(name = "CUS_BLACKLIST_TYPES")
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name = "ID_BLACKLIST_TYPE")),
	@AttributeOverride(name = "name", column = @Column(name = "STR_BLACKLIST_TYPE", nullable = false, length = DbEntry.LENGTH_STRING_MEDIUM)) })
public class BlacklistType extends NamedLookUpEntry {

    /** serial version uid. */
    private static final long serialVersionUID = 4434212678535191122L;

    /**
     * the error code to return in case of a match on a blacklist with the given
     * type
     */
    @Basic(optional = true)
    @Column(name = "ID_ERROR_CODE", nullable = true)
    private Integer errorCode;

    /**
     * @deprecated
     */
    @SuppressWarnings("deprecation")
    @Deprecated
    public BlacklistType() {
	super();
    }

    /**
     * @param id
     *            the id
     * @deprecated
     */
    @Deprecated
    public BlacklistType(int id) {
	super(id);
    }

    /**
     * Returns the error code.
     *
     * @return the error code
     */
    public Integer getErrorCode() {
	return this.errorCode;
    }

    /**
     * Whether the error code is set.
     *
     * @return true or false
     */
    public boolean isSetErrorCode() {
	return this.errorCode != null;
    }

    /**
     * Sets the error code.
     *
     * @param errorCode
     *            the error code to set.
     */
    public void setErrorCode(Integer errorCode) {
	this.errorCode = errorCode;
    }
}
