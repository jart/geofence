/* (c) 2014 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */

package org.geoserver.geofence.gui.client.service;

import java.util.List;

import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import org.geoserver.geofence.gui.client.ApplicationException;
import org.geoserver.geofence.gui.client.model.RolenameModel;
import org.geoserver.geofence.gui.client.model.UserGroupModel;
import org.geoserver.geofence.gui.client.model.data.ProfileCustomProps;


/**
 * The Interface ProfilesManagerRemoteService.
 */
@RemoteServiceRelativePath("ProfilesManagerRemoteService")
public interface ProfilesManagerRemoteService extends RemoteService
{

    /**
     * Gets the profiles.
     *
     * @param config
     *            the config
     * @param full
     *            the full
     * @return the profiles
     * @throws ApplicationException
     *             the application exception
     */
    public PagingLoadResult<UserGroupModel> getProfiles(int offset, int limit, boolean full) throws ApplicationException;
    public PagingLoadResult<RolenameModel> getRolenames(int offset, int limit, boolean full) throws ApplicationException;

    /**
     * Save profile.
     *
     * @param profile
     *            the profile
     * @throws ApplicationException
     *             the application exception
     */
    public void saveProfile(UserGroupModel profile) throws ApplicationException;

    /**
     * Delete profile.
     *
     * @param profile
     *            the profile
     * @throws ApplicationException
     *             the application exception
     */
    public void deleteProfile(UserGroupModel profile) throws ApplicationException;

    /**
     * @param ruleId
     * @param customProps
     * @throws ApplicationException
     */
    public PagingLoadResult<ProfileCustomProps> getProfileCustomProps(int offset, int limit, UserGroupModel profile)
        throws ApplicationException;

    /**
     * @param ruleId
     * @param customProps
     * @throws ApplicationException
     */
    public void setProfileProps(Long profileId, List<ProfileCustomProps> customProps) throws ApplicationException;

}
