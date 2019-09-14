/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.tasks.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the TasksEntry service. Represents a row in the &quot;TMS_TasksEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.tasks.model.impl.TasksEntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.tasks.model.impl.TasksEntryImpl</code>.
 * </p>
 *
 * @author Ryan Park
 * @see TasksEntry
 * @generated
 */
@ProviderType
public interface TasksEntryModel
	extends BaseModel<TasksEntry>, GroupedModel, ShardedModel {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tasks entry model instance should use the {@link TasksEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this tasks entry.
	 *
	 * @return the primary key of this tasks entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tasks entry.
	 *
	 * @param primaryKey the primary key of this tasks entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tasks entry ID of this tasks entry.
	 *
	 * @return the tasks entry ID of this tasks entry
	 */
	public long getTasksEntryId();

	/**
	 * Sets the tasks entry ID of this tasks entry.
	 *
	 * @param tasksEntryId the tasks entry ID of this tasks entry
	 */
	public void setTasksEntryId(long tasksEntryId);

	/**
	 * Returns the group ID of this tasks entry.
	 *
	 * @return the group ID of this tasks entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tasks entry.
	 *
	 * @param groupId the group ID of this tasks entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tasks entry.
	 *
	 * @return the company ID of this tasks entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tasks entry.
	 *
	 * @param companyId the company ID of this tasks entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tasks entry.
	 *
	 * @return the user ID of this tasks entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tasks entry.
	 *
	 * @param userId the user ID of this tasks entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tasks entry.
	 *
	 * @return the user uuid of this tasks entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tasks entry.
	 *
	 * @param userUuid the user uuid of this tasks entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tasks entry.
	 *
	 * @return the user name of this tasks entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tasks entry.
	 *
	 * @param userName the user name of this tasks entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tasks entry.
	 *
	 * @return the create date of this tasks entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tasks entry.
	 *
	 * @param createDate the create date of this tasks entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tasks entry.
	 *
	 * @return the modified date of this tasks entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tasks entry.
	 *
	 * @param modifiedDate the modified date of this tasks entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this tasks entry.
	 *
	 * @return the title of this tasks entry
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this tasks entry.
	 *
	 * @param title the title of this tasks entry
	 */
	public void setTitle(String title);

	/**
	 * Returns the priority of this tasks entry.
	 *
	 * @return the priority of this tasks entry
	 */
	public int getPriority();

	/**
	 * Sets the priority of this tasks entry.
	 *
	 * @param priority the priority of this tasks entry
	 */
	public void setPriority(int priority);

	/**
	 * Returns the assignee user ID of this tasks entry.
	 *
	 * @return the assignee user ID of this tasks entry
	 */
	public long getAssigneeUserId();

	/**
	 * Sets the assignee user ID of this tasks entry.
	 *
	 * @param assigneeUserId the assignee user ID of this tasks entry
	 */
	public void setAssigneeUserId(long assigneeUserId);

	/**
	 * Returns the assignee user uuid of this tasks entry.
	 *
	 * @return the assignee user uuid of this tasks entry
	 */
	public String getAssigneeUserUuid();

	/**
	 * Sets the assignee user uuid of this tasks entry.
	 *
	 * @param assigneeUserUuid the assignee user uuid of this tasks entry
	 */
	public void setAssigneeUserUuid(String assigneeUserUuid);

	/**
	 * Returns the resolver user ID of this tasks entry.
	 *
	 * @return the resolver user ID of this tasks entry
	 */
	public long getResolverUserId();

	/**
	 * Sets the resolver user ID of this tasks entry.
	 *
	 * @param resolverUserId the resolver user ID of this tasks entry
	 */
	public void setResolverUserId(long resolverUserId);

	/**
	 * Returns the resolver user uuid of this tasks entry.
	 *
	 * @return the resolver user uuid of this tasks entry
	 */
	public String getResolverUserUuid();

	/**
	 * Sets the resolver user uuid of this tasks entry.
	 *
	 * @param resolverUserUuid the resolver user uuid of this tasks entry
	 */
	public void setResolverUserUuid(String resolverUserUuid);

	/**
	 * Returns the due date of this tasks entry.
	 *
	 * @return the due date of this tasks entry
	 */
	public Date getDueDate();

	/**
	 * Sets the due date of this tasks entry.
	 *
	 * @param dueDate the due date of this tasks entry
	 */
	public void setDueDate(Date dueDate);

	/**
	 * Returns the finish date of this tasks entry.
	 *
	 * @return the finish date of this tasks entry
	 */
	public Date getFinishDate();

	/**
	 * Sets the finish date of this tasks entry.
	 *
	 * @param finishDate the finish date of this tasks entry
	 */
	public void setFinishDate(Date finishDate);

	/**
	 * Returns the status of this tasks entry.
	 *
	 * @return the status of this tasks entry
	 */
	public int getStatus();

	/**
	 * Sets the status of this tasks entry.
	 *
	 * @param status the status of this tasks entry
	 */
	public void setStatus(int status);

}