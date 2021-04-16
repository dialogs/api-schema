# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [authentication.proto](#authentication.proto)
    - [AuthSession](#dialog.AuthSession)
    - [ForceReloadContacts](#dialog.ForceReloadContacts)
    - [ForceReloadDialogs](#dialog.ForceReloadDialogs)
    - [ForceReloadField](#dialog.ForceReloadField)
    - [ForceReloadHistory](#dialog.ForceReloadHistory)
    - [RequestApplyExternalSessionAuth](#dialog.RequestApplyExternalSessionAuth)
    - [RequestChangePassword](#dialog.RequestChangePassword)
    - [RequestCompleteOAuth2](#dialog.RequestCompleteOAuth2)
    - [RequestGetAuthSessions](#dialog.RequestGetAuthSessions)
    - [RequestGetIdToken](#dialog.RequestGetIdToken)
    - [RequestGetOAuth2Params](#dialog.RequestGetOAuth2Params)
    - [RequestResendCode](#dialog.RequestResendCode)
    - [RequestSendAuthCallObsolete](#dialog.RequestSendAuthCallObsolete)
    - [RequestSendAuthCodeObsolete](#dialog.RequestSendAuthCodeObsolete)
    - [RequestSendCodeByPhoneCall](#dialog.RequestSendCodeByPhoneCall)
    - [RequestSignInObsolete](#dialog.RequestSignInObsolete)
    - [RequestSignOut](#dialog.RequestSignOut)
    - [RequestSignUp](#dialog.RequestSignUp)
    - [RequestSignUpObsolete](#dialog.RequestSignUpObsolete)
    - [RequestStartAnonymousAuth](#dialog.RequestStartAnonymousAuth)
    - [RequestStartAuthTransaction](#dialog.RequestStartAuthTransaction)
    - [RequestStartCertificateAuth](#dialog.RequestStartCertificateAuth)
    - [RequestStartEmailAuth](#dialog.RequestStartEmailAuth)
    - [RequestStartPhoneAuth](#dialog.RequestStartPhoneAuth)
    - [RequestStartTokenAuth](#dialog.RequestStartTokenAuth)
    - [RequestStartUsernameAuth](#dialog.RequestStartUsernameAuth)
    - [RequestTerminateAllSessions](#dialog.RequestTerminateAllSessions)
    - [RequestTerminateSession](#dialog.RequestTerminateSession)
    - [RequestValidateCode](#dialog.RequestValidateCode)
    - [RequestValidatePassword](#dialog.RequestValidatePassword)
    - [ResponseAuth](#dialog.ResponseAuth)
    - [ResponseGetAuthSessions](#dialog.ResponseGetAuthSessions)
    - [ResponseGetIdToken](#dialog.ResponseGetIdToken)
    - [ResponseGetOAuth2Params](#dialog.ResponseGetOAuth2Params)
    - [ResponseGetSelf](#dialog.ResponseGetSelf)
    - [ResponseSendAuthCodeObsolete](#dialog.ResponseSendAuthCodeObsolete)
    - [ResponseStartAuthTransaction](#dialog.ResponseStartAuthTransaction)
    - [ResponseStartEmailAuth](#dialog.ResponseStartEmailAuth)
    - [ResponseStartPhoneAuth](#dialog.ResponseStartPhoneAuth)
    - [ResponseStartUsernameAuth](#dialog.ResponseStartUsernameAuth)
    - [UpdateForceReloadState](#dialog.UpdateForceReloadState)
  
    - [AuthExtraInfoType](#dialog.AuthExtraInfoType)
    - [AuthHolder](#dialog.AuthHolder)
    - [EmailActivationType](#dialog.EmailActivationType)
    - [PhoneActivationType](#dialog.PhoneActivationType)
  
    - [Authentication](#dialog.Authentication)
  
- [clickroad.proto](#clickroad.proto)
    - [RequestTrackEvent](#clickroad.RequestTrackEvent)
    - [ResponseTrackEvent](#clickroad.ResponseTrackEvent)
    - [TrackContext](#clickroad.TrackContext)
    - [TrackContext.ContextEntry](#clickroad.TrackContext.ContextEntry)
    - [TrackError](#clickroad.TrackError)
    - [TrackEvent](#clickroad.TrackEvent)
    - [TrackMetric](#clickroad.TrackMetric)
    - [TrackScreenView](#clickroad.TrackScreenView)
    - [TrackSocial](#clickroad.TrackSocial)
    - [TrackTiming](#clickroad.TrackTiming)
  
    - [ClickRoad](#clickroad.ClickRoad)
  
- [config_sync.proto](#config_sync.proto)
    - [FeatureFlag](#dialog.FeatureFlag)
    - [Parameter](#dialog.Parameter)
    - [RequestEditParameter](#dialog.RequestEditParameter)
    - [RequestFeatureFlags](#dialog.RequestFeatureFlags)
    - [RequestGetParameters](#dialog.RequestGetParameters)
    - [ResponseFeatureFlags](#dialog.ResponseFeatureFlags)
    - [ResponseGetParameters](#dialog.ResponseGetParameters)
    - [UpdateFeatureFlagChanged](#dialog.UpdateFeatureFlagChanged)
    - [UpdateParameterChanged](#dialog.UpdateParameterChanged)
  
    - [ConfigSync](#dialog.ConfigSync)
  
- [contacts.proto](#contacts.proto)
    - [EmailToImport](#dialog.EmailToImport)
    - [PhoneToImport](#dialog.PhoneToImport)
    - [RequestAddContact](#dialog.RequestAddContact)
    - [RequestDeferredImportContacts](#dialog.RequestDeferredImportContacts)
    - [RequestDeferredImportContacts.PhoneContact](#dialog.RequestDeferredImportContacts.PhoneContact)
    - [RequestGetContacts](#dialog.RequestGetContacts)
    - [RequestImportContacts](#dialog.RequestImportContacts)
    - [RequestRemoveContact](#dialog.RequestRemoveContact)
    - [RequestSearchContacts](#dialog.RequestSearchContacts)
    - [ResponseDeferredImportContacts](#dialog.ResponseDeferredImportContacts)
    - [ResponseGetContacts](#dialog.ResponseGetContacts)
    - [ResponseGetContacts.UsersByPhoneEntry](#dialog.ResponseGetContacts.UsersByPhoneEntry)
    - [ResponseImportContacts](#dialog.ResponseImportContacts)
    - [ResponseSearchContacts](#dialog.ResponseSearchContacts)
    - [UpdateContactRegistered](#dialog.UpdateContactRegistered)
    - [UpdateContactsAddTaskSuspended](#dialog.UpdateContactsAddTaskSuspended)
    - [UpdateContactsAdded](#dialog.UpdateContactsAdded)
    - [UpdateContactsAdded.UsersByPhoneEntry](#dialog.UpdateContactsAdded.UsersByPhoneEntry)
    - [UpdateContactsRemoved](#dialog.UpdateContactsRemoved)
  
    - [Contacts](#dialog.Contacts)
  
- [counters.proto](#counters.proto)
    - [AppCounters](#dialog.AppCounters)
    - [UnreadDialog](#dialog.UnreadDialog)
    - [UpdateCountersChanged](#dialog.UpdateCountersChanged)
  
- [crypto.proto](#crypto.proto)
    - [RequestKeyExchange](#dialog.RequestKeyExchange)
    - [ResponseKeyExchange](#dialog.ResponseKeyExchange)
  
    - [Crypto](#dialog.Crypto)
  
- [definitions.proto](#definitions.proto)
    - [DataClock](#dialog.DataClock)
    - [DialogOptions](#dialog.DialogOptions)
    - [UUIDValue](#dialog.UUIDValue)
  
    - [File-level Extensions](#definitions.proto-extensions)
  
- [device_info.proto](#device_info.proto)
    - [ClientInfo](#dialog.ClientInfo)
    - [RequestNotifyAboutDeviceInfo](#dialog.RequestNotifyAboutDeviceInfo)
  
    - [PlatformType](#dialog.PlatformType)
  
    - [DeviceInfo](#dialog.DeviceInfo)
  
- [event_bus.proto](#event_bus.proto)
    - [RequestJoinEventBus](#dialog.RequestJoinEventBus)
    - [RequestKeepAliveEventBus](#dialog.RequestKeepAliveEventBus)
    - [RequestPostToEventBus](#dialog.RequestPostToEventBus)
    - [ResponseJoinEventBus](#dialog.ResponseJoinEventBus)
    - [UpdateEventBusDeviceConnected](#dialog.UpdateEventBusDeviceConnected)
    - [UpdateEventBusDeviceDisconnected](#dialog.UpdateEventBusDeviceDisconnected)
    - [UpdateEventBusDisposed](#dialog.UpdateEventBusDisposed)
    - [UpdateEventBusMessage](#dialog.UpdateEventBusMessage)
  
    - [EventBus](#dialog.EventBus)
  
- [events.proto](#events.proto)
    - [Event](#dialog.events.Event)
    - [Event.Invite](#dialog.events.Event.Invite)
    - [Event.Kick](#dialog.events.Event.Kick)
    - [Event.Mention](#dialog.events.Event.Mention)
    - [Event.Reactions](#dialog.events.Event.Reactions)
    - [Event.Reactions.Reaction](#dialog.events.Event.Reactions.Reaction)
    - [Event.Reactions.Reaction.UsersEntry](#dialog.events.Event.Reactions.Reaction.UsersEntry)
    - [Event.Reply](#dialog.events.Event.Reply)
    - [LoadEventsRequest](#dialog.events.LoadEventsRequest)
    - [LoadEventsResponse](#dialog.events.LoadEventsResponse)
    - [UpdateEvent](#dialog.events.UpdateEvent)
  
    - [LoadMode](#dialog.events.LoadMode)
  
    - [Events](#dialog.events.Events)
  
- [gateway_service.proto](#gateway_service.proto)
    - [GetDifferenceCommand](#dialog.GetDifferenceCommand)
    - [ServiceUpdate](#dialog.ServiceUpdate)
  
- [groups.proto](#groups.proto)
    - [Group](#dialog.Group)
    - [GroupData](#dialog.GroupData)
    - [GroupMemberPermission](#dialog.GroupMemberPermission)
    - [GroupPartialInfo](#dialog.GroupPartialInfo)
    - [Member](#dialog.Member)
    - [RequestCreateGroup](#dialog.RequestCreateGroup)
    - [RequestDeleteGroup](#dialog.RequestDeleteGroup)
    - [RequestEditGroupAbout](#dialog.RequestEditGroupAbout)
    - [RequestEditGroupAvatar](#dialog.RequestEditGroupAvatar)
    - [RequestEditGroupBasePermissions](#dialog.RequestEditGroupBasePermissions)
    - [RequestEditGroupTitle](#dialog.RequestEditGroupTitle)
    - [RequestEditMemberPermissions](#dialog.RequestEditMemberPermissions)
    - [RequestGetGroupInviteUrl](#dialog.RequestGetGroupInviteUrl)
    - [RequestGetGroupInviteUrlBase](#dialog.RequestGetGroupInviteUrlBase)
    - [RequestGetGroupMemberPermissions](#dialog.RequestGetGroupMemberPermissions)
    - [RequestGetGroupPartialInfo](#dialog.RequestGetGroupPartialInfo)
    - [RequestInviteUser](#dialog.RequestInviteUser)
    - [RequestJoinGroup](#dialog.RequestJoinGroup)
    - [RequestJoinGroupByPeer](#dialog.RequestJoinGroupByPeer)
    - [RequestKickUser](#dialog.RequestKickUser)
    - [RequestLeaveGroup](#dialog.RequestLeaveGroup)
    - [RequestLoadMembers](#dialog.RequestLoadMembers)
    - [RequestMakeUserAdmin](#dialog.RequestMakeUserAdmin)
    - [RequestRemoveGroupAvatar](#dialog.RequestRemoveGroupAvatar)
    - [RequestRevokeInviteUrl](#dialog.RequestRevokeInviteUrl)
    - [RequestSetGroupShortname](#dialog.RequestSetGroupShortname)
    - [RequestTransferOwnership](#dialog.RequestTransferOwnership)
    - [ResponseCreateGroup](#dialog.ResponseCreateGroup)
    - [ResponseEditGroupAvatar](#dialog.ResponseEditGroupAvatar)
    - [ResponseGetGroupInviteUrlBase](#dialog.ResponseGetGroupInviteUrlBase)
    - [ResponseGetGroupMemberPermissions](#dialog.ResponseGetGroupMemberPermissions)
    - [ResponseInviteUrl](#dialog.ResponseInviteUrl)
    - [ResponseJoinGroup](#dialog.ResponseJoinGroup)
    - [ResponseLoadMembers](#dialog.ResponseLoadMembers)
    - [ResponseMember](#dialog.ResponseMember)
    - [UpdateGroup](#dialog.UpdateGroup)
    - [UpdateGroupAboutChanged](#dialog.UpdateGroupAboutChanged)
    - [UpdateGroupAboutChangedObsolete](#dialog.UpdateGroupAboutChangedObsolete)
    - [UpdateGroupAvatarChanged](#dialog.UpdateGroupAvatarChanged)
    - [UpdateGroupAvatarChangedObsolete](#dialog.UpdateGroupAvatarChangedObsolete)
    - [UpdateGroupBasePermissionsChanged](#dialog.UpdateGroupBasePermissionsChanged)
    - [UpdateGroupInviteObsolete](#dialog.UpdateGroupInviteObsolete)
    - [UpdateGroupMemberDiff](#dialog.UpdateGroupMemberDiff)
    - [UpdateGroupMemberInvited](#dialog.UpdateGroupMemberInvited)
    - [UpdateGroupMemberPermissionsChanged](#dialog.UpdateGroupMemberPermissionsChanged)
    - [UpdateGroupMembersCountChanged](#dialog.UpdateGroupMembersCountChanged)
    - [UpdateGroupMembersUpdateObsolete](#dialog.UpdateGroupMembersUpdateObsolete)
    - [UpdateGroupMembersUpdated](#dialog.UpdateGroupMembersUpdated)
    - [UpdateGroupOwnerChanged](#dialog.UpdateGroupOwnerChanged)
    - [UpdateGroupShortnameChanged](#dialog.UpdateGroupShortnameChanged)
    - [UpdateGroupTitleChanged](#dialog.UpdateGroupTitleChanged)
    - [UpdateGroupTitleChangedObsolete](#dialog.UpdateGroupTitleChangedObsolete)
    - [UpdateGroupUserInvitedObsolete](#dialog.UpdateGroupUserInvitedObsolete)
    - [UpdateGroupUserKickObsolete](#dialog.UpdateGroupUserKickObsolete)
    - [UpdateGroupUserLeaveObsolete](#dialog.UpdateGroupUserLeaveObsolete)
  
    - [GroupAdminPermission](#dialog.GroupAdminPermission)
    - [GroupType](#dialog.GroupType)
  
    - [Groups](#dialog.Groups)
  
- [integrations.proto](#integrations.proto)
    - [RequestGetIntegrationToken](#dialog.RequestGetIntegrationToken)
    - [RequestRevokeIntegrationToken](#dialog.RequestRevokeIntegrationToken)
    - [ResponseIntegrationToken](#dialog.ResponseIntegrationToken)
  
    - [Integrations](#dialog.Integrations)
  
- [media_and_files.proto](#media_and_files.proto)
    - [AudioLocation](#dialog.AudioLocation)
    - [Avatar](#dialog.Avatar)
    - [AvatarImage](#dialog.AvatarImage)
    - [Color](#dialog.Color)
    - [FastThumb](#dialog.FastThumb)
    - [FileLocation](#dialog.FileLocation)
    - [FileUrlDescription](#dialog.FileUrlDescription)
    - [FileUrlError](#dialog.FileUrlError)
    - [HTTPHeader](#dialog.HTTPHeader)
    - [ImageLocation](#dialog.ImageLocation)
    - [PredefinedColor](#dialog.PredefinedColor)
    - [RequestCommitFileUpload](#dialog.RequestCommitFileUpload)
    - [RequestGetFileUploadPartUrl](#dialog.RequestGetFileUploadPartUrl)
    - [RequestGetFileUploadUrl](#dialog.RequestGetFileUploadUrl)
    - [RequestGetFileUrl](#dialog.RequestGetFileUrl)
    - [RequestGetFileUrlBuilder](#dialog.RequestGetFileUrlBuilder)
    - [RequestGetFileUrls](#dialog.RequestGetFileUrls)
    - [ResponseCommitFileUpload](#dialog.ResponseCommitFileUpload)
    - [ResponseGetFileUploadPartUrl](#dialog.ResponseGetFileUploadPartUrl)
    - [ResponseGetFileUploadUrl](#dialog.ResponseGetFileUploadUrl)
    - [ResponseGetFileUrl](#dialog.ResponseGetFileUrl)
    - [ResponseGetFileUrlBuilder](#dialog.ResponseGetFileUrlBuilder)
    - [ResponseGetFileUrls](#dialog.ResponseGetFileUrls)
    - [RgbColor](#dialog.RgbColor)
  
    - [Colors](#dialog.Colors)
    - [FileUrlError.ErrorTag](#dialog.FileUrlError.ErrorTag)
  
    - [MediaAndFiles](#dialog.MediaAndFiles)
  
- [messaging.proto](#messaging.proto)
    - [AudioMedia](#dialog.AudioMedia)
    - [BinaryMessage](#dialog.BinaryMessage)
    - [DeletedMessage](#dialog.DeletedMessage)
    - [Dialog](#dialog.Dialog)
    - [DialogData](#dialog.DialogData)
    - [DialogGroup](#dialog.DialogGroup)
    - [DialogIndex](#dialog.DialogIndex)
    - [DialogListEntry](#dialog.DialogListEntry)
    - [DialogShort](#dialog.DialogShort)
    - [DocumentEx](#dialog.DocumentEx)
    - [DocumentExPhoto](#dialog.DocumentExPhoto)
    - [DocumentExVideo](#dialog.DocumentExVideo)
    - [DocumentExVoice](#dialog.DocumentExVoice)
    - [DocumentMessage](#dialog.DocumentMessage)
    - [EmptyMessage](#dialog.EmptyMessage)
    - [HistoryMessage](#dialog.HistoryMessage)
    - [HistoryMessageLight](#dialog.HistoryMessageLight)
    - [ImageMedia](#dialog.ImageMedia)
    - [InteractiveMedia](#dialog.InteractiveMedia)
    - [InteractiveMediaButton](#dialog.InteractiveMediaButton)
    - [InteractiveMediaConfirm](#dialog.InteractiveMediaConfirm)
    - [InteractiveMediaGroup](#dialog.InteractiveMediaGroup)
    - [InteractiveMediaSelect](#dialog.InteractiveMediaSelect)
    - [InteractiveMediaSelectOption](#dialog.InteractiveMediaSelectOption)
    - [InteractiveMediaTranslation](#dialog.InteractiveMediaTranslation)
    - [InteractiveMediaTranslationGroup](#dialog.InteractiveMediaTranslationGroup)
    - [InteractiveMediaWidget](#dialog.InteractiveMediaWidget)
    - [JsonMessage](#dialog.JsonMessage)
    - [Mention](#dialog.Mention)
    - [MessageAttributes](#dialog.MessageAttributes)
    - [MessageContent](#dialog.MessageContent)
    - [MessageMedia](#dialog.MessageMedia)
    - [MessageReaction](#dialog.MessageReaction)
    - [MessageStatus](#dialog.MessageStatus)
    - [ParagraphStyle](#dialog.ParagraphStyle)
    - [PinnedMessages](#dialog.PinnedMessages)
    - [QuotedMessage](#dialog.QuotedMessage)
    - [ReferencedMessages](#dialog.ReferencedMessages)
    - [RequestArchiveChat](#dialog.RequestArchiveChat)
    - [RequestClearChat](#dialog.RequestClearChat)
    - [RequestCountForeignMessages](#dialog.RequestCountForeignMessages)
    - [RequestDeleteChat](#dialog.RequestDeleteChat)
    - [RequestDeleteMessage](#dialog.RequestDeleteMessage)
    - [RequestDeleteMessageObsolete](#dialog.RequestDeleteMessageObsolete)
    - [RequestDialogListDifference](#dialog.RequestDialogListDifference)
    - [RequestDoInteractiveMediaAction](#dialog.RequestDoInteractiveMediaAction)
    - [RequestFavouriteDialog](#dialog.RequestFavouriteDialog)
    - [RequestFetchDialogIndex](#dialog.RequestFetchDialogIndex)
    - [RequestGetLastConversationMessages](#dialog.RequestGetLastConversationMessages)
    - [RequestGetUpdatedMessages](#dialog.RequestGetUpdatedMessages)
    - [RequestHideDialog](#dialog.RequestHideDialog)
    - [RequestHistoryDifference](#dialog.RequestHistoryDifference)
    - [RequestLoadArchived](#dialog.RequestLoadArchived)
    - [RequestLoadDialogs](#dialog.RequestLoadDialogs)
    - [RequestLoadGroupedDialogs](#dialog.RequestLoadGroupedDialogs)
    - [RequestLoadHistory](#dialog.RequestLoadHistory)
    - [RequestLoadHistoryLight](#dialog.RequestLoadHistoryLight)
    - [RequestMessageRead](#dialog.RequestMessageRead)
    - [RequestMessageReads](#dialog.RequestMessageReads)
    - [RequestMessageReceived](#dialog.RequestMessageReceived)
    - [RequestMessageReceives](#dialog.RequestMessageReceives)
    - [RequestMessageRemoveReaction](#dialog.RequestMessageRemoveReaction)
    - [RequestMessageSetReaction](#dialog.RequestMessageSetReaction)
    - [RequestNotifyDialogOpened](#dialog.RequestNotifyDialogOpened)
    - [RequestPinMessage](#dialog.RequestPinMessage)
    - [RequestReadDialogLater](#dialog.RequestReadDialogLater)
    - [RequestSendMessage](#dialog.RequestSendMessage)
    - [RequestShowDialog](#dialog.RequestShowDialog)
    - [RequestUnfavouriteDialog](#dialog.RequestUnfavouriteDialog)
    - [RequestUnpinMessage](#dialog.RequestUnpinMessage)
    - [RequestUpdateMessage](#dialog.RequestUpdateMessage)
    - [ResponseCountForeignMessages](#dialog.ResponseCountForeignMessages)
    - [ResponseDialogListDifference](#dialog.ResponseDialogListDifference)
    - [ResponseDialogsOrder](#dialog.ResponseDialogsOrder)
    - [ResponseFetchDialogIndex](#dialog.ResponseFetchDialogIndex)
    - [ResponseGetLastConversationMessages](#dialog.ResponseGetLastConversationMessages)
    - [ResponseGetLastConversationMessages.Pair](#dialog.ResponseGetLastConversationMessages.Pair)
    - [ResponseGetUpdatedMessages](#dialog.ResponseGetUpdatedMessages)
    - [ResponseGetUpdatedMessages.UpdatedMessage](#dialog.ResponseGetUpdatedMessages.UpdatedMessage)
    - [ResponseHistoryDifference](#dialog.ResponseHistoryDifference)
    - [ResponseLoadArchived](#dialog.ResponseLoadArchived)
    - [ResponseLoadDialogs](#dialog.ResponseLoadDialogs)
    - [ResponseLoadGroupedDialogs](#dialog.ResponseLoadGroupedDialogs)
    - [ResponseLoadHistory](#dialog.ResponseLoadHistory)
    - [ResponseLoadHistoryLight](#dialog.ResponseLoadHistoryLight)
    - [ResponseMessageReads](#dialog.ResponseMessageReads)
    - [ResponseMessageReceives](#dialog.ResponseMessageReceives)
    - [ResponseReactionsResponse](#dialog.ResponseReactionsResponse)
    - [ResponseSendMessage](#dialog.ResponseSendMessage)
    - [SearchPredicate](#dialog.SearchPredicate)
    - [ServiceEx](#dialog.ServiceEx)
    - [ServiceExChangedAbout](#dialog.ServiceExChangedAbout)
    - [ServiceExChangedAvatar](#dialog.ServiceExChangedAvatar)
    - [ServiceExChangedShortname](#dialog.ServiceExChangedShortname)
    - [ServiceExChangedTitle](#dialog.ServiceExChangedTitle)
    - [ServiceExChangedTopic](#dialog.ServiceExChangedTopic)
    - [ServiceExChatArchived](#dialog.ServiceExChatArchived)
    - [ServiceExChatRestored](#dialog.ServiceExChatRestored)
    - [ServiceExContactRegistered](#dialog.ServiceExContactRegistered)
    - [ServiceExGroupCreated](#dialog.ServiceExGroupCreated)
    - [ServiceExPhoneCall](#dialog.ServiceExPhoneCall)
    - [ServiceExPhoneMissed](#dialog.ServiceExPhoneMissed)
    - [ServiceExPhoneRejected](#dialog.ServiceExPhoneRejected)
    - [ServiceExUserInvited](#dialog.ServiceExUserInvited)
    - [ServiceExUserJoined](#dialog.ServiceExUserJoined)
    - [ServiceExUserKicked](#dialog.ServiceExUserKicked)
    - [ServiceExUserLeft](#dialog.ServiceExUserLeft)
    - [ServiceMessage](#dialog.ServiceMessage)
    - [StickerMessage](#dialog.StickerMessage)
    - [TextCommand](#dialog.TextCommand)
    - [TextExMarkdown](#dialog.TextExMarkdown)
    - [TextMessage](#dialog.TextMessage)
    - [TextMessageEx](#dialog.TextMessageEx)
    - [TextModernAttach](#dialog.TextModernAttach)
    - [TextModernField](#dialog.TextModernField)
    - [TextModernMessage](#dialog.TextModernMessage)
    - [UnsupportedMessage](#dialog.UnsupportedMessage)
    - [UpdateChatArchive](#dialog.UpdateChatArchive)
    - [UpdateChatClear](#dialog.UpdateChatClear)
    - [UpdateChatDelete](#dialog.UpdateChatDelete)
    - [UpdateChatGroupsChanged](#dialog.UpdateChatGroupsChanged)
    - [UpdateDialogFavouriteChanged](#dialog.UpdateDialogFavouriteChanged)
    - [UpdateDialogReadLaterChanged](#dialog.UpdateDialogReadLaterChanged)
    - [UpdateInteractiveMediaEvent](#dialog.UpdateInteractiveMediaEvent)
    - [UpdateMessage](#dialog.UpdateMessage)
    - [UpdateMessageContentChanged](#dialog.UpdateMessageContentChanged)
    - [UpdateMessageDelete](#dialog.UpdateMessageDelete)
    - [UpdateMessageEditRejectedByHook](#dialog.UpdateMessageEditRejectedByHook)
    - [UpdateMessageRead](#dialog.UpdateMessageRead)
    - [UpdateMessageReadByMe](#dialog.UpdateMessageReadByMe)
    - [UpdateMessageReceived](#dialog.UpdateMessageReceived)
    - [UpdateMessageRejectedByHook](#dialog.UpdateMessageRejectedByHook)
    - [UpdateMessageSent](#dialog.UpdateMessageSent)
    - [UpdatePinnedMessagesChanged](#dialog.UpdatePinnedMessagesChanged)
    - [UpdateReactionsUpdate](#dialog.UpdateReactionsUpdate)
    - [UpdateThreadCreated](#dialog.UpdateThreadCreated)
    - [UpdateThreadLifted](#dialog.UpdateThreadLifted)
    - [WebpageMedia](#dialog.WebpageMedia)
  
    - [DialogsFilter](#dialog.DialogsFilter)
    - [InteractiveMediaStyle](#dialog.InteractiveMediaStyle)
    - [ListLoadMode](#dialog.ListLoadMode)
    - [MessageState](#dialog.MessageState)
  
    - [Messaging](#dialog.Messaging)
  
- [miniappsregistry.proto](#miniappsregistry.proto)
    - [AccessTokenResponse](#dialog.AccessTokenResponse)
    - [ExtensionPoint](#dialog.ExtensionPoint)
    - [FindAppRequest](#dialog.FindAppRequest)
    - [FindAppResponse](#dialog.FindAppResponse)
    - [GetAppsRequest](#dialog.GetAppsRequest)
    - [GetAppsResponse](#dialog.GetAppsResponse)
    - [GetExtensionsResponse](#dialog.GetExtensionsResponse)
    - [GroupConditions](#dialog.GroupConditions)
    - [GroupConditions.GroupCondition](#dialog.GroupConditions.GroupCondition)
    - [IssueAccessTokenRequest](#dialog.IssueAccessTokenRequest)
    - [MessageConditions](#dialog.MessageConditions)
    - [MessageConditions.MessageCondition](#dialog.MessageConditions.MessageCondition)
    - [MessageConditions.MessageCondition.DocumentCondition](#dialog.MessageConditions.MessageCondition.DocumentCondition)
    - [MiniApp](#dialog.MiniApp)
    - [MiniApp.LocalesEntry](#dialog.MiniApp.LocalesEntry)
    - [UpdateMiniApp](#dialog.UpdateMiniApp)
  
    - [AppType](#dialog.AppType)
    - [UpdateMiniApp.AppLifecycle](#dialog.UpdateMiniApp.AppLifecycle)
  
    - [ClientsMiniAppsRegistry](#dialog.ClientsMiniAppsRegistry)
  
- [miscellaneous.proto](#miscellaneous.proto)
    - [Any](#dialog.Any)
    - [CallsConfig](#dialog.CallsConfig)
    - [Config](#dialog.Config)
    - [Discover](#dialog.Discover)
    - [Extension](#dialog.Extension)
    - [InvitesConfig](#dialog.InvitesConfig)
    - [RecursiveMapValue](#dialog.RecursiveMapValue)
    - [RecursiveMapValue.Array](#dialog.RecursiveMapValue.Array)
    - [RecursiveMapValue.Item](#dialog.RecursiveMapValue.Item)
    - [RecursiveMapValue.Value](#dialog.RecursiveMapValue.Value)
    - [ResponseBool](#dialog.ResponseBool)
    - [ResponseSeq](#dialog.ResponseSeq)
    - [ResponseSeqDate](#dialog.ResponseSeqDate)
    - [ResponseSeqDateMid](#dialog.ResponseSeqDateMid)
    - [ResponseVoid](#dialog.ResponseVoid)
    - [ServerMetaInfo](#dialog.ServerMetaInfo)
    - [ServicePeers](#dialog.ServicePeers)
    - [UpdateConfig](#dialog.UpdateConfig)
  
    - [RtcpMuxPolicy](#dialog.RtcpMuxPolicy)
    - [SupportedServerMethodsType](#dialog.SupportedServerMethodsType)
    - [UpdateOptimization](#dialog.UpdateOptimization)
  
- [obsolete.proto](#obsolete.proto)
    - [ObsoleteGetDifferenceCommand](#dialog.ObsoleteGetDifferenceCommand)
    - [ObsoleteOutPeer](#dialog.ObsoleteOutPeer)
    - [ObsoletePeer](#dialog.ObsoletePeer)
    - [ObsoletePeersList](#dialog.ObsoletePeersList)
    - [ObsoleteSeqUpdateBox](#dialog.ObsoleteSeqUpdateBox)
    - [ObsoleteServiceUpdate](#dialog.ObsoleteServiceUpdate)
    - [ObsoleteWeakUpdateBox](#dialog.ObsoleteWeakUpdateBox)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateCallHandled](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateCallHandled)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceConnected](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceConnected)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceDisconnected](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceDisconnected)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDisposed](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDisposed)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusMessage](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusMessage)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState.ObsoleteForceReloadField](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState.ObsoleteForceReloadField)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateGroupOnline](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateGroupOnline)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateIncomingCall](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateIncomingCall)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateTyping](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateTyping)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateUserLastSeen](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateUserLastSeen)
    - [ObsoleteWeakUpdateCommand](#dialog.ObsoleteWeakUpdateCommand)
    - [ObsoleteWeakUpdateCommand.ObsoleteMyOnline](#dialog.ObsoleteWeakUpdateCommand.ObsoleteMyOnline)
    - [ObsoleteWeakUpdateCommand.ObsoleteMyTyping](#dialog.ObsoleteWeakUpdateCommand.ObsoleteMyTyping)
  
    - [ObsoletePeer.ObsoletePeerType](#dialog.ObsoletePeer.ObsoletePeerType)
    - [ObsoleteTypingType](#dialog.ObsoleteTypingType)
    - [ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed.ObsoleteDisposalReason](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed.ObsoleteDisposalReason)
  
    - [Obsolete](#dialog.Obsolete)
  
- [peers.proto](#peers.proto)
    - [GroupOutPeer](#dialog.GroupOutPeer)
    - [OutPeer](#dialog.OutPeer)
    - [Peer](#dialog.Peer)
    - [UserOutPeer](#dialog.UserOutPeer)
  
    - [PeerType](#dialog.PeerType)
  
- [permissions.proto](#permissions.proto)
    - [RequestGetPermissions](#dialog.RequestGetPermissions)
    - [ResponseGetPermissions](#dialog.ResponseGetPermissions)
    - [UpdatePermissionsChange](#dialog.UpdatePermissionsChange)
  
    - [Permission](#dialog.Permission)
  
    - [Permissions](#dialog.Permissions)
  
- [presence.proto](#presence.proto)
    - [RequestGetUserLastPresence](#dialog.RequestGetUserLastPresence)
    - [RequestSetOnline](#dialog.RequestSetOnline)
    - [RequestStartTyping](#dialog.RequestStartTyping)
    - [RequestStopTyping](#dialog.RequestStopTyping)
    - [ResponseUserLastPresence](#dialog.ResponseUserLastPresence)
    - [ResponseUserLastPresence.UserNotFoundError](#dialog.ResponseUserLastPresence.UserNotFoundError)
    - [UpdateGroupOnline](#dialog.UpdateGroupOnline)
    - [UpdateGroupTyping](#dialog.UpdateGroupTyping)
    - [UpdateGroupTyping.UserTyping](#dialog.UpdateGroupTyping.UserTyping)
    - [UpdateTyping](#dialog.UpdateTyping)
    - [UpdateTypingStop](#dialog.UpdateTypingStop)
    - [UpdateUserLastSeen](#dialog.UpdateUserLastSeen)
    - [UpdateUserOffline](#dialog.UpdateUserOffline)
    - [UpdateUserOnline](#dialog.UpdateUserOnline)
  
    - [DeviceType](#dialog.DeviceType)
    - [TypingType](#dialog.TypingType)
  
    - [Presence](#dialog.Presence)
  
- [privacy.proto](#privacy.proto)
    - [RequestBlockUser](#dialog.RequestBlockUser)
    - [RequestLoadBlockedUsers](#dialog.RequestLoadBlockedUsers)
    - [RequestUnblockUser](#dialog.RequestUnblockUser)
    - [ResponseLoadBlockedUsers](#dialog.ResponseLoadBlockedUsers)
    - [UpdateUserBlocked](#dialog.UpdateUserBlocked)
    - [UpdateUserUnblocked](#dialog.UpdateUserUnblocked)
  
    - [Privacy](#dialog.Privacy)
  
- [profile.proto](#profile.proto)
    - [RequestChangeUserStatus](#dialog.RequestChangeUserStatus)
    - [RequestCheckNickName](#dialog.RequestCheckNickName)
    - [RequestEditAbout](#dialog.RequestEditAbout)
    - [RequestEditAvatar](#dialog.RequestEditAvatar)
    - [RequestEditCustomProfile](#dialog.RequestEditCustomProfile)
    - [RequestEditMyPreferredLanguages](#dialog.RequestEditMyPreferredLanguages)
    - [RequestEditMyTimeZone](#dialog.RequestEditMyTimeZone)
    - [RequestEditName](#dialog.RequestEditName)
    - [RequestEditNickName](#dialog.RequestEditNickName)
    - [RequestEditSex](#dialog.RequestEditSex)
    - [RequestRemoveAvatar](#dialog.RequestRemoveAvatar)
    - [ResponseEditAvatar](#dialog.ResponseEditAvatar)
  
    - [Profile](#dialog.Profile)
  
- [push.proto](#push.proto)
    - [RequestRegisterApplePush](#dialog.RequestRegisterApplePush)
    - [RequestRegisterApplePushKit](#dialog.RequestRegisterApplePushKit)
    - [RequestRegisterApplePushToken](#dialog.RequestRegisterApplePushToken)
    - [RequestRegisterAvroraPushToken](#dialog.RequestRegisterAvroraPushToken)
    - [RequestRegisterGooglePush](#dialog.RequestRegisterGooglePush)
    - [RequestUnregisterApplePush](#dialog.RequestUnregisterApplePush)
    - [RequestUnregisterApplePushKit](#dialog.RequestUnregisterApplePushKit)
    - [RequestUnregisterApplePushToken](#dialog.RequestUnregisterApplePushToken)
    - [RequestUnregisterAvroraPushToken](#dialog.RequestUnregisterAvroraPushToken)
    - [RequestUnregisterGooglePush](#dialog.RequestUnregisterGooglePush)
  
    - [Push](#dialog.Push)
  
- [push_content.proto](#push_content.proto)
    - [EncryptedPushContent](#dialog.EncryptedPushContent)
    - [LocalizableString](#dialog.LocalizableString)
    - [PushPeer](#dialog.PushPeer)
  
    - [PushEventType](#dialog.PushEventType)
    - [PushPeerType](#dialog.PushPeerType)
  
- [raw_api.proto](#raw_api.proto)
    - [RequestRawRequest](#dialog.RequestRawRequest)
    - [ResponseRawRequest](#dialog.ResponseRawRequest)
  
    - [RawAPI](#dialog.RawAPI)
  
- [reactions.proto](#reactions.proto)
    - [GetMessageReactionsRequest](#dialog.reactions.GetMessageReactionsRequest)
    - [GetMessageReactionsResponse](#dialog.reactions.GetMessageReactionsResponse)
    - [GetReactionsRequest](#dialog.reactions.GetReactionsRequest)
    - [GetReactionsResponse](#dialog.reactions.GetReactionsResponse)
    - [MessageReactions](#dialog.reactions.MessageReactions)
    - [MessageReactionsUpdate](#dialog.reactions.MessageReactionsUpdate)
    - [Reaction](#dialog.reactions.Reaction)
    - [RequestRemoveMessageReaction](#dialog.reactions.RequestRemoveMessageReaction)
    - [RequestSetMessageReaction](#dialog.reactions.RequestSetMessageReaction)
  
    - [Reactions](#dialog.reactions.Reactions)
  
- [registration.proto](#registration.proto)
    - [RegisterDeprecatedDeviceRequest](#dialog.RegisterDeprecatedDeviceRequest)
    - [RequestExchangeAuthIdForToken](#dialog.RequestExchangeAuthIdForToken)
    - [RequestRegisterDevice](#dialog.RequestRegisterDevice)
    - [ResponseDeviceRequest](#dialog.ResponseDeviceRequest)
  
    - [AuthorizationMethod](#dialog.AuthorizationMethod)
  
    - [Registration](#dialog.Registration)
  
- [search.proto](#search.proto)
    - [MessageSearchItem](#dialog.MessageSearchItem)
    - [MessageSearchResult](#dialog.MessageSearchResult)
    - [PeerSearchResult](#dialog.PeerSearchResult)
    - [RequestFieldAutocomplete](#dialog.RequestFieldAutocomplete)
    - [RequestGetPromotedPeers](#dialog.RequestGetPromotedPeers)
    - [RequestGetRecommendations](#dialog.RequestGetRecommendations)
    - [RequestLoadUserSearchByPredicatesCount](#dialog.RequestLoadUserSearchByPredicatesCount)
    - [RequestLoadUserSearchByPredicatesResults](#dialog.RequestLoadUserSearchByPredicatesResults)
    - [RequestMessageSearch](#dialog.RequestMessageSearch)
    - [RequestMessageSearchMore](#dialog.RequestMessageSearchMore)
    - [RequestPeerSearch](#dialog.RequestPeerSearch)
    - [RequestResolvePeer](#dialog.RequestResolvePeer)
    - [RequestSimpleSearch](#dialog.RequestSimpleSearch)
    - [RequestSimpleSearchMore](#dialog.RequestSimpleSearchMore)
    - [ResponseFieldAutocomplete](#dialog.ResponseFieldAutocomplete)
    - [ResponseGetPromotedPeers](#dialog.ResponseGetPromotedPeers)
    - [ResponseGetRecommendations](#dialog.ResponseGetRecommendations)
    - [ResponseLoadUserSearchByPredicatesCount](#dialog.ResponseLoadUserSearchByPredicatesCount)
    - [ResponseLoadUserSearchByPredicatesResults](#dialog.ResponseLoadUserSearchByPredicatesResults)
    - [ResponseMessageSearchResponse](#dialog.ResponseMessageSearchResponse)
    - [ResponsePeerSearch](#dialog.ResponsePeerSearch)
    - [ResponseResolvePeer](#dialog.ResponseResolvePeer)
    - [SearchAndCondition](#dialog.SearchAndCondition)
    - [SearchCondition](#dialog.SearchCondition)
    - [SearchOrCondition](#dialog.SearchOrCondition)
    - [SearchPeerCondition](#dialog.SearchPeerCondition)
    - [SearchPeerContentType](#dialog.SearchPeerContentType)
    - [SearchPeerTypeCondition](#dialog.SearchPeerTypeCondition)
    - [SearchPieceText](#dialog.SearchPieceText)
    - [SearchSenderIdConfition](#dialog.SearchSenderIdConfition)
    - [SimpleContactSearchCondition](#dialog.SimpleContactSearchCondition)
    - [SimpleGroupSearchCondition](#dialog.SimpleGroupSearchCondition)
    - [SimpleMessageSearchCondition](#dialog.SimpleMessageSearchCondition)
    - [SimplePeerSearchCondition](#dialog.SimplePeerSearchCondition)
    - [SimpleSearchCondition](#dialog.SimpleSearchCondition)
    - [SimpleUserProfileSearchCondition](#dialog.SimpleUserProfileSearchCondition)
    - [UserMatch](#dialog.UserMatch)
    - [criterion](#dialog.criterion)
  
    - [SearchContentType](#dialog.SearchContentType)
    - [SearchDirection](#dialog.SearchDirection)
    - [SearchPeerType](#dialog.SearchPeerType)
  
    - [Search](#dialog.Search)
  
- [sequence_and_updates.proto](#sequence_and_updates.proto)
    - [GroupMembersSubset](#dialog.GroupMembersSubset)
    - [PeersList](#dialog.PeersList)
    - [RequestGetDialogsDifference](#dialog.RequestGetDialogsDifference)
    - [RequestGetDifference](#dialog.RequestGetDifference)
    - [RequestGetPartialPeerInfo](#dialog.RequestGetPartialPeerInfo)
    - [RequestGetReferencedEntitites](#dialog.RequestGetReferencedEntitites)
    - [RequestGetState](#dialog.RequestGetState)
    - [RequestSubscribeFromGroupOnline](#dialog.RequestSubscribeFromGroupOnline)
    - [RequestSubscribeFromOnline](#dialog.RequestSubscribeFromOnline)
    - [RequestSubscribeToGroupOnline](#dialog.RequestSubscribeToGroupOnline)
    - [RequestSubscribeToOnline](#dialog.RequestSubscribeToOnline)
    - [ResponseGetDialogsDifference](#dialog.ResponseGetDialogsDifference)
    - [ResponseGetDifference](#dialog.ResponseGetDifference)
    - [ResponseGetPartialPeerInfo](#dialog.ResponseGetPartialPeerInfo)
    - [ResponseGetReferencedEntitites](#dialog.ResponseGetReferencedEntitites)
    - [SeqUpdateBox](#dialog.SeqUpdateBox)
    - [UpdateCombinedUpdate](#dialog.UpdateCombinedUpdate)
    - [UpdateContainer](#dialog.UpdateContainer)
    - [UpdateEmptyUpdate](#dialog.UpdateEmptyUpdate)
    - [UpdateFatSeqUpdate](#dialog.UpdateFatSeqUpdate)
    - [UpdateRawUpdate](#dialog.UpdateRawUpdate)
    - [UpdateSeqUpdate](#dialog.UpdateSeqUpdate)
    - [UpdateSeqUpdateTooLong](#dialog.UpdateSeqUpdateTooLong)
    - [UpdateWeakFatUpdate](#dialog.UpdateWeakFatUpdate)
    - [UpdateWeakUpdate](#dialog.UpdateWeakUpdate)
    - [WeakUpdateBox](#dialog.WeakUpdateBox)
    - [WeakUpdateBox.UpdateForceReloadState](#dialog.WeakUpdateBox.UpdateForceReloadState)
    - [WeakUpdateBox.UpdateForceReloadState.ForceReloadField](#dialog.WeakUpdateBox.UpdateForceReloadState.ForceReloadField)
    - [WeakUpdateCommand](#dialog.WeakUpdateCommand)
    - [WeakUpdateCommand.ChangeMyOnline](#dialog.WeakUpdateCommand.ChangeMyOnline)
    - [WeakUpdateCommand.ChangeMyTyping](#dialog.WeakUpdateCommand.ChangeMyTyping)
    - [WeakUpdateCommand.SubscribeToOnlines](#dialog.WeakUpdateCommand.SubscribeToOnlines)
  
    - [SequenceAndUpdates](#dialog.SequenceAndUpdates)
  
- [spaces.proto](#spaces.proto)
    - [RequestCreateSpace](#dialog.RequestCreateSpace)
    - [RequestDeleteSpace](#dialog.RequestDeleteSpace)
    - [RequestGetSpaceInviteUrl](#dialog.RequestGetSpaceInviteUrl)
    - [RequestLoadSpaces](#dialog.RequestLoadSpaces)
    - [RequestRevokeSpaceInviteUrl](#dialog.RequestRevokeSpaceInviteUrl)
    - [RequestSetAbout](#dialog.RequestSetAbout)
    - [RequestSetAvatar](#dialog.RequestSetAvatar)
    - [RequestSetShortname](#dialog.RequestSetShortname)
    - [RequestSetTitle](#dialog.RequestSetTitle)
    - [RequestSpaceInvite](#dialog.RequestSpaceInvite)
    - [RequestSpaceKick](#dialog.RequestSpaceKick)
    - [RequestSpaceLeave](#dialog.RequestSpaceLeave)
    - [RequestStreamSpaceMembers](#dialog.RequestStreamSpaceMembers)
    - [ResponseLoadSpaces](#dialog.ResponseLoadSpaces)
    - [ResponseSpace](#dialog.ResponseSpace)
    - [ResponseSpaceInviteUrl](#dialog.ResponseSpaceInviteUrl)
    - [ResponseSpaceMember](#dialog.ResponseSpaceMember)
    - [Space](#dialog.Space)
    - [Space.General](#dialog.Space.General)
    - [Space.Private](#dialog.Space.Private)
    - [Space.Public](#dialog.Space.Public)
    - [SpaceMember](#dialog.SpaceMember)
    - [SpaceMemberWithPeer](#dialog.SpaceMemberWithPeer)
    - [UpdateSpaceMemberModified](#dialog.UpdateSpaceMemberModified)
    - [UpdateSpaceModified](#dialog.UpdateSpaceModified)
  
    - [Spaces](#dialog.Spaces)
  
- [stickers.proto](#stickers.proto)
    - [RequestAddStickerCollection](#dialog.RequestAddStickerCollection)
    - [RequestAddStickerPackReference](#dialog.RequestAddStickerPackReference)
    - [RequestLoadAcesssibleStickers](#dialog.RequestLoadAcesssibleStickers)
    - [RequestLoadOwnStickers](#dialog.RequestLoadOwnStickers)
    - [RequestLoadStickerCollection](#dialog.RequestLoadStickerCollection)
    - [RequestRemoveStickerCollection](#dialog.RequestRemoveStickerCollection)
    - [RequestRemoveStickerPackReference](#dialog.RequestRemoveStickerPackReference)
    - [ResponseLoadAcesssibleStickers](#dialog.ResponseLoadAcesssibleStickers)
    - [ResponseLoadOwnStickers](#dialog.ResponseLoadOwnStickers)
    - [ResponseLoadStickerCollection](#dialog.ResponseLoadStickerCollection)
    - [ResponseStickersResponse](#dialog.ResponseStickersResponse)
    - [StickerCollection](#dialog.StickerCollection)
    - [StickerDescriptor](#dialog.StickerDescriptor)
    - [UpdateStickerCollectionsChanged](#dialog.UpdateStickerCollectionsChanged)
    - [UpdateStickerPackAdded](#dialog.UpdateStickerPackAdded)
    - [UpdateStickerPackRemoved](#dialog.UpdateStickerPackRemoved)
  
    - [Stickers](#dialog.Stickers)
  
- [threads.proto](#threads.proto)
    - [RequestCreateThread](#dialog.RequestCreateThread)
    - [RequestJoinThread](#dialog.RequestJoinThread)
    - [RequestLiftThread](#dialog.RequestLiftThread)
    - [RequestLoadGroupThreads](#dialog.RequestLoadGroupThreads)
    - [ResponseCreateThread](#dialog.ResponseCreateThread)
    - [ResponseLiftThread](#dialog.ResponseLiftThread)
    - [ResponseLoadGroupThreads](#dialog.ResponseLoadGroupThreads)
    - [ThreadReference](#dialog.ThreadReference)
  
    - [RequestCreateThread.JoinPolicy](#dialog.RequestCreateThread.JoinPolicy)
  
    - [Threads](#dialog.Threads)
  
- [users.proto](#users.proto)
    - [BotCommand](#dialog.BotCommand)
    - [ContactRecord](#dialog.ContactRecord)
    - [FullUser](#dialog.FullUser)
    - [RequestEditUserLocalName](#dialog.RequestEditUserLocalName)
    - [RequestLoadFullUsers](#dialog.RequestLoadFullUsers)
    - [RequestLoadUserData](#dialog.RequestLoadUserData)
    - [RequestLoadUserData.Claim](#dialog.RequestLoadUserData.Claim)
    - [ResponseLoadFullUsers](#dialog.ResponseLoadFullUsers)
    - [ResponseLoadUserData](#dialog.ResponseLoadUserData)
    - [UpdateUser](#dialog.UpdateUser)
    - [UpdateUserAboutChanged](#dialog.UpdateUserAboutChanged)
    - [UpdateUserAvatarChanged](#dialog.UpdateUserAvatarChanged)
    - [UpdateUserBotCommandsChanged](#dialog.UpdateUserBotCommandsChanged)
    - [UpdateUserContactsChanged](#dialog.UpdateUserContactsChanged)
    - [UpdateUserCustomProfileChanged](#dialog.UpdateUserCustomProfileChanged)
    - [UpdateUserExtChanged](#dialog.UpdateUserExtChanged)
    - [UpdateUserFullExtChanged](#dialog.UpdateUserFullExtChanged)
    - [UpdateUserLocalNameChanged](#dialog.UpdateUserLocalNameChanged)
    - [UpdateUserNameChanged](#dialog.UpdateUserNameChanged)
    - [UpdateUserNickChanged](#dialog.UpdateUserNickChanged)
    - [UpdateUserPreferredLanguagesChanged](#dialog.UpdateUserPreferredLanguagesChanged)
    - [UpdateUserSexChanged](#dialog.UpdateUserSexChanged)
    - [UpdateUserStatusChanged](#dialog.UpdateUserStatusChanged)
    - [UpdateUserTimeZoneChanged](#dialog.UpdateUserTimeZoneChanged)
    - [User](#dialog.User)
    - [UserData](#dialog.UserData)
    - [UserData.Ext](#dialog.UserData.Ext)
    - [UserPartialInfo](#dialog.UserPartialInfo)
    - [UserProfile](#dialog.UserProfile)
    - [UserStatus](#dialog.UserStatus)
  
    - [ContactType](#dialog.ContactType)
    - [Sex](#dialog.Sex)
    - [UserData.Hint](#dialog.UserData.Hint)
    - [UserData.Lifecycle](#dialog.UserData.Lifecycle)
    - [UserStatusType](#dialog.UserStatusType)
  
    - [Users](#dialog.Users)
  
- [web_rtc.proto](#web_rtc.proto)
    - [ActiveCall](#dialog.ActiveCall)
    - [AdvertiseMaster](#dialog.AdvertiseMaster)
    - [AdvertisePeer](#dialog.AdvertisePeer)
    - [AdvertiseSelf](#dialog.AdvertiseSelf)
    - [Answer](#dialog.Answer)
    - [CallLogEntry](#dialog.CallLogEntry)
    - [CallMember](#dialog.CallMember)
    - [CallMemberStateHolder](#dialog.CallMemberStateHolder)
    - [CallNameChanged](#dialog.CallNameChanged)
    - [CallStats](#dialog.CallStats)
    - [Candidate](#dialog.Candidate)
    - [CloseSession](#dialog.CloseSession)
    - [DTMF](#dialog.DTMF)
    - [EnableConnection](#dialog.EnableConnection)
    - [GotICECandidate](#dialog.GotICECandidate)
    - [ICECandidate](#dialog.ICECandidate)
    - [ICEServer](#dialog.ICEServer)
    - [NeedDisconnect](#dialog.NeedDisconnect)
    - [NeedOffer](#dialog.NeedOffer)
    - [NegotinationSuccessful](#dialog.NegotinationSuccessful)
    - [Offer](#dialog.Offer)
    - [OnRenegotiationNeeded](#dialog.OnRenegotiationNeeded)
    - [PeerSettings](#dialog.PeerSettings)
    - [RemovedICECandidates](#dialog.RemovedICECandidates)
    - [RequestChangeCallDisplayName](#dialog.RequestChangeCallDisplayName)
    - [RequestDeleteCall](#dialog.RequestDeleteCall)
    - [RequestDoCall](#dialog.RequestDoCall)
    - [RequestGetCallInfo](#dialog.RequestGetCallInfo)
    - [RequestJoinCall](#dialog.RequestJoinCall)
    - [RequestLoadCalls](#dialog.RequestLoadCalls)
    - [RequestRejectCall](#dialog.RequestRejectCall)
    - [ResponseDoCall](#dialog.ResponseDoCall)
    - [ResponseGetCallInfo](#dialog.ResponseGetCallInfo)
    - [ResponseLoadCalls](#dialog.ResponseLoadCalls)
    - [UpdateCallDisposed](#dialog.UpdateCallDisposed)
    - [UpdateCallHandled](#dialog.UpdateCallHandled)
    - [UpdateIncomingCall](#dialog.UpdateIncomingCall)
    - [UpdateIncomingCallDeprecated](#dialog.UpdateIncomingCallDeprecated)
    - [WebRTCSignaling](#dialog.WebRTCSignaling)
  
    - [CallDisposedReason](#dialog.CallDisposedReason)
    - [CallMemberState](#dialog.CallMemberState)
    - [CallStatsType](#dialog.CallStatsType)
    - [DTMFCode](#dialog.DTMFCode)
    - [RejectCallReason](#dialog.RejectCallReason)
  
    - [WebRTC](#dialog.WebRTC)
  
- [Scalar Value Types](#scalar-value-types)



<a name="authentication.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## authentication.proto



<a name="dialog.AuthSession"></a>

### AuthSession
Authentication session


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  | Unuque ID of session |
| auth_holder | [AuthHolder](#dialog.AuthHolder) |  | holder of session. 1 - this device, 2 - other. |
| app_id | [int32](#int32) |  | Application Id that you set during authorization |
| app_title | [string](#string) |  | Deprecated |
| device_title | [string](#string) |  | Deprecated |
| auth_time | [int32](#int32) |  | Time of session creating |
| auth_location | [string](#string) |  | Two-letter country code of session create |
| latitude | [google.protobuf.DoubleValue](#google.protobuf.DoubleValue) |  |  |
| longitude | [google.protobuf.DoubleValue](#google.protobuf.DoubleValue) |  |  |






<a name="dialog.ForceReloadContacts"></a>

### ForceReloadContacts
Tells the client to clear contacts and load them again






<a name="dialog.ForceReloadDialogs"></a>

### ForceReloadDialogs
Tells the client to clear dialogs and load them again






<a name="dialog.ForceReloadField"></a>

### ForceReloadField
Notification to force client to reload some entities from server
Just for old clients. Should be ignore.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| forceReloadDialogs | [ForceReloadDialogs](#dialog.ForceReloadDialogs) |  |  |
| forceReloadContacts | [ForceReloadContacts](#dialog.ForceReloadContacts) |  |  |
| forceReloadHistory | [ForceReloadHistory](#dialog.ForceReloadHistory) |  |  |






<a name="dialog.ForceReloadHistory"></a>

### ForceReloadHistory
Tells the client to clear the specified conversation and load it again
peer the peer whose history should be reloaded


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |






<a name="dialog.RequestApplyExternalSessionAuth"></a>

### RequestApplyExternalSessionAuth
Apply external session to authorize user


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_id | [string](#string) |  |  |






<a name="dialog.RequestChangePassword"></a>

### RequestChangePassword



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| old_password | [string](#string) |  |  |
| new_password | [string](#string) |  |  |






<a name="dialog.RequestCompleteOAuth2"></a>

### RequestCompleteOAuth2
Complete OAuth2 Authentication


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  |  |
| code | [string](#string) |  |  |






<a name="dialog.RequestGetAuthSessions"></a>

### RequestGetAuthSessions
Getting of all active user&#39;s authentication sessions






<a name="dialog.RequestGetIdToken"></a>

### RequestGetIdToken
Get Id Token for external system


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| service | [string](#string) |  | service alias token is intended for * |






<a name="dialog.RequestGetOAuth2Params"></a>

### RequestGetOAuth2Params
Loading OAuth2 Parameters


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  |  |
| redirect_url | [string](#string) |  |  |






<a name="dialog.RequestResendCode"></a>

### RequestResendCode
Performs code resend


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  | Hash of the authorization transaction * |






<a name="dialog.RequestSendAuthCallObsolete"></a>

### RequestSendAuthCallObsolete
Requesting Phone activation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| phone_number | [int64](#int64) |  |  |
| sms_hash | [string](#string) |  |  |
| app_id | [int32](#int32) |  |  |
| api_key | [string](#string) |  |  |






<a name="dialog.RequestSendAuthCodeObsolete"></a>

### RequestSendAuthCodeObsolete
Sending SMS with activation code


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| phone_number | [int64](#int64) |  |  |
| app_id | [int32](#int32) |  |  |
| api_key | [string](#string) |  |  |






<a name="dialog.RequestSendCodeByPhoneCall"></a>

### RequestSendCodeByPhoneCall
Dial phone and dictate auth code


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  | Hash from ResponseStartPhoneAuth |






<a name="dialog.RequestSignInObsolete"></a>

### RequestSignInObsolete
Performing user signin - deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| phone_number | [int64](#int64) |  |  |
| sms_hash | [string](#string) |  |  |
| sms_code | [string](#string) |  |  |
| device_hash | [bytes](#bytes) |  |  |
| device_title | [string](#string) |  |  |
| app_id | [int32](#int32) |  |  |
| app_key | [string](#string) |  |  |






<a name="dialog.RequestSignOut"></a>

### RequestSignOut
SignOut current session






<a name="dialog.RequestSignUp"></a>

### RequestSignUp
Perform user SignUp


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  | Hash of the authorization transaction * |
| name | [string](#string) |  | Your name |
| sex | [Sex](#dialog.Sex) |  | Use it in case of anonymous authorization (deprecated) |
| password | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.RequestSignUpObsolete"></a>

### RequestSignUpObsolete
Performing user signup. If user perform signup on already registered user it just override previous
profile information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| phone_number | [int64](#int64) |  |  |
| sms_hash | [string](#string) |  |  |
| sms_code | [string](#string) |  |  |
| name | [string](#string) |  |  |
| device_hash | [bytes](#bytes) |  |  |
| device_title | [string](#string) |  |  |
| app_id | [int32](#int32) |  |  |
| app_key | [string](#string) |  |  |
| is_silent | [bool](#bool) |  |  |






<a name="dialog.RequestStartAnonymousAuth"></a>

### RequestStartAnonymousAuth
Starting Anonymous login - deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| preferred_languages | [string](#string) | repeated |  |






<a name="dialog.RequestStartAuthTransaction"></a>

### RequestStartAuthTransaction
Start Authentication/Authorization via external oAuth2/OpenID SSO Provider


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Client timezone * |
| preferred_languages | [string](#string) | repeated | First language from this array will be used for some notifications from server * |






<a name="dialog.RequestStartCertificateAuth"></a>

### RequestStartCertificateAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| preferred_languages | [string](#string) | repeated |  |






<a name="dialog.RequestStartEmailAuth"></a>

### RequestStartEmailAuth
Start EMail Activation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| email | [string](#string) |  |  |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Your timezone * |
| preferred_languages | [string](#string) | repeated | First language from this array will be used for some notifications from server * |






<a name="dialog.RequestStartPhoneAuth"></a>

### RequestStartPhoneAuth
Start Phone Activation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| phone_number | [int64](#int64) |  |  |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Your timezone * |
| preferred_languages | [string](#string) | repeated | First language from this array will be used for some notifications from server * |






<a name="dialog.RequestStartTokenAuth"></a>

### RequestStartTokenAuth
Starting token-based login - to authorize bot


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  | Token received from BotFather * |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Your timezone * |
| preferred_languages | [string](#string) | repeated | First language from this array will be used for some notifications from server * |






<a name="dialog.RequestStartUsernameAuth"></a>

### RequestStartUsernameAuth
Starting Login Authentication


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| preferred_languages | [string](#string) | repeated | First language from this array will be used for some notifications from server * |






<a name="dialog.RequestTerminateAllSessions"></a>

### RequestTerminateAllSessions
SignOut on all exept current sessions






<a name="dialog.RequestTerminateSession"></a>

### RequestTerminateSession
SignOut on specified user&#39;s session


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  | Session id |






<a name="dialog.RequestValidateCode"></a>

### RequestValidateCode
Performing user sign in.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  | Hash of the authorization transaction * |
| code | [string](#string) |  | Authorization code |






<a name="dialog.RequestValidatePassword"></a>

### RequestValidatePassword
Validation of account password


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  | Hash of the authorization transaction * |
| password | [string](#string) |  |  |






<a name="dialog.ResponseAuth"></a>

### ResponseAuth
Authentication result


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user | [User](#dialog.User) |  | Registered/authorized user |
| config | [Config](#dialog.Config) |  | Config for that user |
| config_hash | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | Hash of config to later usage |
| extra_info | [AuthExtraInfoType](#dialog.AuthExtraInfoType) | repeated |  |






<a name="dialog.ResponseGetAuthSessions"></a>

### ResponseGetAuthSessions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_auths | [AuthSession](#dialog.AuthSession) | repeated | Active user&#39;s sessions |






<a name="dialog.ResponseGetIdToken"></a>

### ResponseGetIdToken
Get Id Token for external system


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |
| expiration_date | [int64](#int64) |  | Unix time stamp * |






<a name="dialog.ResponseGetOAuth2Params"></a>

### ResponseGetOAuth2Params
Redirect url result


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth_url | [string](#string) |  |  |






<a name="dialog.ResponseGetSelf"></a>

### ResponseGetSelf



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user | [User](#dialog.User) |  | Registered/authorized user |






<a name="dialog.ResponseSendAuthCodeObsolete"></a>

### ResponseSendAuthCodeObsolete



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sms_hash | [string](#string) |  |  |
| is_registered | [bool](#bool) |  |  |






<a name="dialog.ResponseStartAuthTransaction"></a>

### ResponseStartAuthTransaction



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  | Hash of authorization transaction * |






<a name="dialog.ResponseStartEmailAuth"></a>

### ResponseStartEmailAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  | Hash of authorization transaction * |
| is_registered | [bool](#bool) |  | Deprecated |
| activation_type | [EmailActivationType](#dialog.EmailActivationType) |  | Code or password - call ValidateCode if code * |






<a name="dialog.ResponseStartPhoneAuth"></a>

### ResponseStartPhoneAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  | Hash of authorization transaction * |
| is_registered | [bool](#bool) |  | Deprecated |
| activation_type | [PhoneActivationType](#dialog.PhoneActivationType) |  | Code or password - call ValidateCode if code * |






<a name="dialog.ResponseStartUsernameAuth"></a>

### ResponseStartUsernameAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transaction_hash | [string](#string) |  | Hash of authorization transaction * |
| is_registered | [bool](#bool) |  | Deprecated |






<a name="dialog.UpdateForceReloadState"></a>

### UpdateForceReloadState
This update is sent by the server to force a client to reload its data


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fields | [ForceReloadField](#dialog.ForceReloadField) | repeated |  |





 


<a name="dialog.AuthExtraInfoType"></a>

### AuthExtraInfoType


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_EXTRA_INFO | 0 |  |
| NEED_CHANGE_PASSWORD | 1 |  |



<a name="dialog.AuthHolder"></a>

### AuthHolder
Holder of session

| Name | Number | Description |
| ---- | ------ | ----------- |
| AUTHHOLDER_UNKNOWN | 0 |  |
| AUTHHOLDER_THISDEVICE | 1 |  |
| AUTHHOLDER_OTHERDEVICE | 2 |  |



<a name="dialog.EmailActivationType"></a>

### EmailActivationType


| Name | Number | Description |
| ---- | ------ | ----------- |
| EMAILACTIVATIONTYPE_UNKNOWN | 0 |  |
| EMAILACTIVATIONTYPE_CODE | 1 |  |
| EMAILACTIVATIONTYPE_OAUTH2 | 2 |  |
| EMAILACTIVATIONTYPE_PASSWORD | 3 |  |



<a name="dialog.PhoneActivationType"></a>

### PhoneActivationType


| Name | Number | Description |
| ---- | ------ | ----------- |
| PHONEACTIVATIONTYPE_UNKNOWN | 0 |  |
| PHONEACTIVATIONTYPE_CODE | 1 |  |
| PHONEACTIVATIONTYPE_PASSWORD | 2 |  |


 

 


<a name="dialog.Authentication"></a>

### Authentication


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| StartPhoneAuth | [RequestStartPhoneAuth](#dialog.RequestStartPhoneAuth) | [ResponseStartPhoneAuth](#dialog.ResponseStartPhoneAuth) | Start authorization by phone |
| SendCodeByPhoneCall | [RequestSendCodeByPhoneCall](#dialog.RequestSendCodeByPhoneCall) | [ResponseVoid](#dialog.ResponseVoid) | Resend code by transaction hash |
| StartEmailAuth | [RequestStartEmailAuth](#dialog.RequestStartEmailAuth) | [ResponseStartEmailAuth](#dialog.ResponseStartEmailAuth) | Start email authorization process |
| StartAnonymousAuth | [RequestStartAnonymousAuth](#dialog.RequestStartAnonymousAuth) | [ResponseAuth](#dialog.ResponseAuth) | Deprecated |
| StartCertificateAuth | [RequestStartCertificateAuth](#dialog.RequestStartCertificateAuth) | [ResponseAuth](#dialog.ResponseAuth) |  |
| StartTokenAuth | [RequestStartTokenAuth](#dialog.RequestStartTokenAuth) | [ResponseAuth](#dialog.ResponseAuth) | Start token auth authorization (actual for bots) |
| StartUsernameAuth | [RequestStartUsernameAuth](#dialog.RequestStartUsernameAuth) | [ResponseStartUsernameAuth](#dialog.ResponseStartUsernameAuth) | Start login/password authorization process |
| ApplyExternalSessionAuth | [RequestApplyExternalSessionAuth](#dialog.RequestApplyExternalSessionAuth) | [ResponseAuth](#dialog.ResponseAuth) |  |
| GetIdToken | [RequestGetIdToken](#dialog.RequestGetIdToken) | [ResponseGetIdToken](#dialog.ResponseGetIdToken) | Get Id Token for external system |
| StartAuthTransaction | [RequestStartAuthTransaction](#dialog.RequestStartAuthTransaction) | [ResponseStartAuthTransaction](#dialog.ResponseStartAuthTransaction) |  |
| ValidateCode | [RequestValidateCode](#dialog.RequestValidateCode) | [ResponseAuth](#dialog.ResponseAuth) | Validate code received by phone or email Returns error if user does not exist |
| ResendCode | [RequestResendCode](#dialog.RequestResendCode) | [ResponseVoid](#dialog.ResponseVoid) | Resend code if you don&#39;t receive it with first attempt |
| ValidatePassword | [RequestValidatePassword](#dialog.RequestValidatePassword) | [ResponseAuth](#dialog.ResponseAuth) | Validate your passwword |
| GetOAuth2Params | [RequestGetOAuth2Params](#dialog.RequestGetOAuth2Params) | [ResponseGetOAuth2Params](#dialog.ResponseGetOAuth2Params) | Get redirect url |
| CompleteOAuth2 | [RequestCompleteOAuth2](#dialog.RequestCompleteOAuth2) | [ResponseAuth](#dialog.ResponseAuth) | Complete OAuth2 Authentication |
| SignUp | [RequestSignUp](#dialog.RequestSignUp) | [ResponseAuth](#dialog.ResponseAuth) | Sign up existed user |
| GetAuthSessions | [RequestGetAuthSessions](#dialog.RequestGetAuthSessions) | [ResponseGetAuthSessions](#dialog.ResponseGetAuthSessions) | Returns all authorized user&#39;s sessions |
| TerminateSession | [RequestTerminateSession](#dialog.RequestTerminateSession) | [ResponseVoid](#dialog.ResponseVoid) | Deprecated. Does not produce any effect. |
| TerminateAllSessions | [RequestTerminateAllSessions](#dialog.RequestTerminateAllSessions) | [ResponseVoid](#dialog.ResponseVoid) | Log out user |
| SignOut | [RequestSignOut](#dialog.RequestSignOut) | [ResponseVoid](#dialog.ResponseVoid) | Log out current session |
| SignInObsolete | [RequestSignInObsolete](#dialog.RequestSignInObsolete) | [ResponseAuth](#dialog.ResponseAuth) | Deprecated |
| SignUpObsolete | [RequestSignUpObsolete](#dialog.RequestSignUpObsolete) | [ResponseAuth](#dialog.ResponseAuth) | Deprecated |
| SendAuthCodeObsolete | [RequestSendAuthCodeObsolete](#dialog.RequestSendAuthCodeObsolete) | [ResponseSendAuthCodeObsolete](#dialog.ResponseSendAuthCodeObsolete) | Deprecated |
| SendAuthCallObsolete | [RequestSendAuthCallObsolete](#dialog.RequestSendAuthCallObsolete) | [ResponseVoid](#dialog.ResponseVoid) | Deprecated |
| ChangePassword | [RequestChangePassword](#dialog.RequestChangePassword) | [ResponseVoid](#dialog.ResponseVoid) |  |
| GetSelf | [.google.protobuf.Empty](#google.protobuf.Empty) | [ResponseGetSelf](#dialog.ResponseGetSelf) |  |

 



<a name="clickroad.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## clickroad.proto



<a name="clickroad.RequestTrackEvent"></a>

### RequestTrackEvent



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cid | [string](#string) |  |  |
| metrics | [TrackMetric](#clickroad.TrackMetric) | repeated |  |






<a name="clickroad.ResponseTrackEvent"></a>

### ResponseTrackEvent



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cid | [string](#string) |  |  |






<a name="clickroad.TrackContext"></a>

### TrackContext



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| context | [TrackContext.ContextEntry](#clickroad.TrackContext.ContextEntry) | repeated |  |






<a name="clickroad.TrackContext.ContextEntry"></a>

### TrackContext.ContextEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="clickroad.TrackError"></a>

### TrackError



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message | [string](#string) |  |  |
| fatal | [bool](#bool) |  |  |






<a name="clickroad.TrackEvent"></a>

### TrackEvent



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| category | [string](#string) |  |  |
| action | [string](#string) |  |  |
| label | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| value | [google.protobuf.DoubleValue](#google.protobuf.DoubleValue) |  |  |






<a name="clickroad.TrackMetric"></a>

### TrackMetric



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| context | [TrackContext](#clickroad.TrackContext) |  |  |
| screen_view | [TrackScreenView](#clickroad.TrackScreenView) |  |  |
| event | [TrackEvent](#clickroad.TrackEvent) |  |  |
| timing | [TrackTiming](#clickroad.TrackTiming) |  |  |
| social | [TrackSocial](#clickroad.TrackSocial) |  |  |
| error | [TrackError](#clickroad.TrackError) |  |  |
| deduplication_id | [int64](#int64) |  |  |






<a name="clickroad.TrackScreenView"></a>

### TrackScreenView



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| source | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| url | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="clickroad.TrackSocial"></a>

### TrackSocial



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| network | [string](#string) |  |  |
| action | [string](#string) |  |  |
| target | [string](#string) |  |  |






<a name="clickroad.TrackTiming"></a>

### TrackTiming



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| category | [string](#string) |  |  |
| variable | [string](#string) |  |  |
| time | [int64](#int64) |  |  |
| label | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |





 

 

 


<a name="clickroad.ClickRoad"></a>

### ClickRoad


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| TrackEvent | [RequestTrackEvent](#clickroad.RequestTrackEvent) | [ResponseTrackEvent](#clickroad.ResponseTrackEvent) |  |

 



<a name="config_sync.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## config_sync.proto



<a name="dialog.FeatureFlag"></a>

### FeatureFlag



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |
| clock | [int64](#int64) |  |  |






<a name="dialog.Parameter"></a>

### Parameter
Syncing Parameter


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  | Key of parameter |
| value | [string](#string) |  | Value of parameter |
| clock | [int64](#int64) |  | last modification date |






<a name="dialog.RequestEditParameter"></a>

### RequestEditParameter
Change parameter value


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| clock | [int64](#int64) |  | current known clock |






<a name="dialog.RequestFeatureFlags"></a>

### RequestFeatureFlags



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| from_clock | [int64](#int64) |  |  |






<a name="dialog.RequestGetParameters"></a>

### RequestGetParameters
Getting Parameters


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| from_clock | [int64](#int64) |  |  |






<a name="dialog.ResponseFeatureFlags"></a>

### ResponseFeatureFlags



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| feature_config | [FeatureFlag](#dialog.FeatureFlag) | repeated |  |






<a name="dialog.ResponseGetParameters"></a>

### ResponseGetParameters



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parameters | [Parameter](#dialog.Parameter) | repeated |  |






<a name="dialog.UpdateFeatureFlagChanged"></a>

### UpdateFeatureFlagChanged



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| feature | [FeatureFlag](#dialog.FeatureFlag) |  |  |






<a name="dialog.UpdateParameterChanged"></a>

### UpdateParameterChanged
Update about parameter change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  | deprecated use this field from parameter |
| value | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | deprecated use this field from parameter |
| parameter | [Parameter](#dialog.Parameter) |  | changed parameter |





 

 

 


<a name="dialog.ConfigSync"></a>

### ConfigSync


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetParameters | [RequestGetParameters](#dialog.RequestGetParameters) | [ResponseGetParameters](#dialog.ResponseGetParameters) |  |
| EditParameter | [RequestEditParameter](#dialog.RequestEditParameter) | [ResponseSeq](#dialog.ResponseSeq) |  |
| FeatureFlags | [RequestFeatureFlags](#dialog.RequestFeatureFlags) | [ResponseFeatureFlags](#dialog.ResponseFeatureFlags) |  |

 



<a name="contacts.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contacts.proto



<a name="dialog.EmailToImport"></a>

### EmailToImport
Email for import


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| email | [string](#string) |  | email for importing |
| name | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | optional name for contact |






<a name="dialog.PhoneToImport"></a>

### PhoneToImport
Phone for import


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| phone_number | [int64](#int64) |  | phone number for import in international format |
| name | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | optional name for contact |






<a name="dialog.RequestAddContact"></a>

### RequestAddContact
Adding contact to contact list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| access_hash | [int64](#int64) |  |  |






<a name="dialog.RequestDeferredImportContacts"></a>

### RequestDeferredImportContacts
Importing hashed phones and contact names for building contact list
Import evaluated lazily, response does not contain any info
Maximum amount of items for import per method call equals to 100.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device_id | [string](#string) |  | some stable device identifier |
| phone_contacts | [RequestDeferredImportContacts.PhoneContact](#dialog.RequestDeferredImportContacts.PhoneContact) | repeated | list of hashed phone contacts from the device |






<a name="dialog.RequestDeferredImportContacts.PhoneContact"></a>

### RequestDeferredImportContacts.PhoneContact



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| phone_hash | [string](#string) |  | hash of phone number in format: name-of-hash-function:hashed-phone-number name of the hash function is optional (if not present, the default function will be used) |
| contact_name | [string](#string) |  | name of contact as is on the device |






<a name="dialog.RequestGetContacts"></a>

### RequestGetContacts
Getting current contact list
SHA256 hash of list of a comma-separated list of contact UIDs in ascending
order may be passed in contactsHash parameter.
If the contact list was not changed, isNotChanged will be true.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| contacts_hash | [string](#string) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestImportContacts"></a>

### RequestImportContacts
Importing phones and emails for building contact list
Maximum amount of items for import per method call equals to 100.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| phones | [PhoneToImport](#dialog.PhoneToImport) | repeated |  |
| emails | [EmailToImport](#dialog.EmailToImport) | repeated |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated | Optimizations drops some info from response to decrease traffic and latency |






<a name="dialog.RequestRemoveContact"></a>

### RequestRemoveContact
Removing contact from contact list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| access_hash | [int64](#int64) |  |  |






<a name="dialog.RequestSearchContacts"></a>

### RequestSearchContacts
Searching contacts by user&#39;s query


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| request | [string](#string) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.ResponseDeferredImportContacts"></a>

### ResponseDeferredImportContacts



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| task_id | [string](#string) |  |  |






<a name="dialog.ResponseGetContacts"></a>

### ResponseGetContacts



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| is_not_changed | [bool](#bool) |  |  |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| users_by_phone | [ResponseGetContacts.UsersByPhoneEntry](#dialog.ResponseGetContacts.UsersByPhoneEntry) | repeated |  |






<a name="dialog.ResponseGetContacts.UsersByPhoneEntry"></a>

### ResponseGetContacts.UsersByPhoneEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [int32](#int32) |  |  |






<a name="dialog.ResponseImportContacts"></a>

### ResponseImportContacts



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  | Deprecated |
| state | [bytes](#bytes) |  | Server state related to current client, used by server only |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated | Optimizations drops some info from response to decrease traffic and latency |






<a name="dialog.ResponseSearchContacts"></a>

### ResponseSearchContacts



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [User](#dialog.User) | repeated | Registered contacts (for old bot sdk compatibility)

/ --------------------------------------------------- |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |






<a name="dialog.UpdateContactRegistered"></a>

### UpdateContactRegistered
Update about contact registration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  | User id of a registered contact |
| is_silent | [bool](#bool) |  | deprecated |
| date | [int64](#int64) |  | deprecated |
| mid | [UUIDValue](#dialog.UUIDValue) |  | deprecated |






<a name="dialog.UpdateContactsAddTaskSuspended"></a>

### UpdateContactsAddTaskSuspended
Update about suspending task - normally it should be ignored


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| task_id | [string](#string) |  |  |






<a name="dialog.UpdateContactsAdded"></a>

### UpdateContactsAdded
Update about contacts added


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uids | [int32](#int32) | repeated | User ids of the registered contacts |
| task_id | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Id of the task that finished |
| users_by_phone | [UpdateContactsAdded.UsersByPhoneEntry](#dialog.UpdateContactsAdded.UsersByPhoneEntry) | repeated | mapping phone hashes to id of users that are already present in the system |






<a name="dialog.UpdateContactsAdded.UsersByPhoneEntry"></a>

### UpdateContactsAdded.UsersByPhoneEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [int32](#int32) |  |  |






<a name="dialog.UpdateContactsRemoved"></a>

### UpdateContactsRemoved
Update about contacts removed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uids | [int32](#int32) | repeated |  |





 

 

 


<a name="dialog.Contacts"></a>

### Contacts


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| ImportContacts | [RequestImportContacts](#dialog.RequestImportContacts) | [ResponseImportContacts](#dialog.ResponseImportContacts) | Import contacts and wait while query is not finished |
| DeferredImportContacts | [RequestDeferredImportContacts](#dialog.RequestDeferredImportContacts) | [ResponseDeferredImportContacts](#dialog.ResponseDeferredImportContacts) | Same as above, but without waiting response |
| GetContacts | [RequestGetContacts](#dialog.RequestGetContacts) | [ResponseGetContacts](#dialog.ResponseGetContacts) |  |
| RemoveContact | [RequestRemoveContact](#dialog.RequestRemoveContact) | [ResponseSeq](#dialog.ResponseSeq) |  |
| AddContact | [RequestAddContact](#dialog.RequestAddContact) | [ResponseSeq](#dialog.ResponseSeq) |  |
| SearchContacts | [RequestSearchContacts](#dialog.RequestSearchContacts) | [ResponseSearchContacts](#dialog.ResponseSearchContacts) | Search contacts by query string |

 



<a name="counters.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## counters.proto



<a name="dialog.AppCounters"></a>

### AppCounters



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| global_counter | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | Global unread counter |
| global_dialogs_counter | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | Global count of dialogs with positive counter values |
| unread_dialogs | [UnreadDialog](#dialog.UnreadDialog) | repeated | map of chat peer id to unread to counters |






<a name="dialog.UnreadDialog"></a>

### UnreadDialog
Unread dialogs


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  | dialog peer |
| counter | [int32](#int32) |  | unread messages count |






<a name="dialog.UpdateCountersChanged"></a>

### UpdateCountersChanged
deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| counters | [AppCounters](#dialog.AppCounters) |  |  |
| ts | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |





 

 

 

 



<a name="crypto.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto.proto



<a name="dialog.RequestKeyExchange"></a>

### RequestKeyExchange
Exchange public keys


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| client_key | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |






<a name="dialog.ResponseKeyExchange"></a>

### ResponseKeyExchange



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| server_key | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |





 

 

 


<a name="dialog.Crypto"></a>

### Crypto


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| KeyExchange | [RequestKeyExchange](#dialog.RequestKeyExchange) | [ResponseKeyExchange](#dialog.ResponseKeyExchange) |  |

 



<a name="definitions.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## definitions.proto



<a name="dialog.DataClock"></a>

### DataClock
server timestamp when state was created or modified


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| clock | [int64](#int64) |  |  |






<a name="dialog.DialogOptions"></a>

### DialogOptions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| log | [string](#string) |  |  |
| required | [bool](#bool) |  |  |






<a name="dialog.UUIDValue"></a>

### UUIDValue



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| msb | [int64](#int64) |  |  |
| lsb | [int64](#int64) |  |  |





 

 


<a name="definitions.proto-extensions"></a>

### File-level Extensions
| Extension | Type | Base | Number | Description |
| --------- | ---- | ---- | ------ | ----------- |
| dlg | DialogOptions | .google.protobuf.FieldOptions | 100001 |  |

 

 



<a name="device_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## device_info.proto



<a name="dialog.ClientInfo"></a>

### ClientInfo
Generic client info, containing information about platform type, version, sdk etc


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| platform | [PlatformType](#dialog.PlatformType) |  | The platform enum. Can be either Android, Web or iOS |
| device_name | [string](#string) |  | For android: vendor and model; For iOS: model; For Web: platform and user agent |
| app_name | [string](#string) |  | Optional application name |
| app_version | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Application version |
| sdk_version | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Optional SDK version |
| preferred_languages | [string](#string) | repeated | Optional ISO-639 language code and ISO-3166 country code: ru-RU |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Optional TimeZone id |






<a name="dialog.RequestNotifyAboutDeviceInfo"></a>

### RequestNotifyAboutDeviceInfo
Notifying about device information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| preferred_languages | [string](#string) | repeated | First language from this array will be used for some notifications from server * |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Your timezone * |





 


<a name="dialog.PlatformType"></a>

### PlatformType


| Name | Number | Description |
| ---- | ------ | ----------- |
| PLATFORMTYPE_UNKNOWN | 0 |  |
| PLATFORMTYPE_ANDROID | 1 |  |
| PLATFORMTYPE_IOS | 2 |  |
| PLATFORMTYPE_WEB | 3 |  |
| PLATFORMTYPE_CLC | 4 |  |
| PLATFORMTYPE_TESTS | 42 |  |


 

 


<a name="dialog.DeviceInfo"></a>

### DeviceInfo


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NotifyAboutDeviceInfo | [RequestNotifyAboutDeviceInfo](#dialog.RequestNotifyAboutDeviceInfo) | [ResponseVoid](#dialog.ResponseVoid) | Set info about current device |

 



<a name="event_bus.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## event_bus.proto



<a name="dialog.RequestJoinEventBus"></a>

### RequestJoinEventBus
Joining Event Bus


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Bus id |
| timeout | [int64](#int64) |  | Join TTL |






<a name="dialog.RequestKeepAliveEventBus"></a>

### RequestKeepAliveEventBus
Keep Alive Event Bus


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Bus id |
| timeout | [int64](#int64) |  | Keep TTL |






<a name="dialog.RequestPostToEventBus"></a>

### RequestPostToEventBus
Event Bus Destination


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Bus id |
| destinations | [int64](#int64) | repeated | Destination device ids |
| message | [bytes](#bytes) |  | Message to send |






<a name="dialog.ResponseJoinEventBus"></a>

### ResponseJoinEventBus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device_id | [int64](#int64) |  | Generated device id for this event bus |






<a name="dialog.UpdateEventBusDeviceConnected"></a>

### UpdateEventBusDeviceConnected
Update about pubsub device connected


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Bus id |
| user_id | [int32](#int32) |  | Connected user id |
| device_id | [int64](#int64) |  | Connected device id |
| peer | [Peer](#dialog.Peer) |  | Connected peer |






<a name="dialog.UpdateEventBusDeviceDisconnected"></a>

### UpdateEventBusDeviceDisconnected
Update about device disconnected


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Bus id |
| user_id | [int32](#int32) |  |  |
| device_id | [int64](#int64) |  |  |
| peer | [Peer](#dialog.Peer) |  |  |






<a name="dialog.UpdateEventBusDisposed"></a>

### UpdateEventBusDisposed
Event Bus dispose


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="dialog.UpdateEventBusMessage"></a>

### UpdateEventBusMessage
Event Bus Message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Bus id |
| sender_id | [int32](#int32) |  |  |
| sender_device_id | [int64](#int64) |  |  |
| message | [bytes](#bytes) |  |  |





 

 

 


<a name="dialog.EventBus"></a>

### EventBus


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| JoinEventBus | [RequestJoinEventBus](#dialog.RequestJoinEventBus) | [ResponseJoinEventBus](#dialog.ResponseJoinEventBus) |  |
| KeepAliveEventBus | [RequestKeepAliveEventBus](#dialog.RequestKeepAliveEventBus) | [ResponseVoid](#dialog.ResponseVoid) |  |
| PostToEventBus | [RequestPostToEventBus](#dialog.RequestPostToEventBus) | [ResponseVoid](#dialog.ResponseVoid) |  |

 



<a name="events.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## events.proto



<a name="dialog.events.Event"></a>

### Event



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| clock | [int64](#int64) |  | time when event happened |
| id | [string](#string) |  | unique id of event (no more than 50 symbols) |
| mention | [Event.Mention](#dialog.events.Event.Mention) |  |  |
| reactions | [Event.Reactions](#dialog.events.Event.Reactions) |  |  |
| reply | [Event.Reply](#dialog.events.Event.Reply) |  |  |
| invite | [Event.Invite](#dialog.events.Event.Invite) |  |  |
| kick | [Event.Kick](#dialog.events.Event.Kick) |  |  |






<a name="dialog.events.Event.Invite"></a>

### Event.Invite



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [dialog.Peer](#dialog.Peer) |  | group |
| user | [int32](#int32) |  | inviter userId |






<a name="dialog.events.Event.Kick"></a>

### Event.Kick



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [dialog.Peer](#dialog.Peer) |  | group |
| user | [int32](#int32) |  | kicker userId |






<a name="dialog.events.Event.Mention"></a>

### Event.Mention



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [dialog.Peer](#dialog.Peer) |  | dialog where mentioned |
| mid | [dialog.UUIDValue](#dialog.UUIDValue) |  | id of message where mentioned |
| user | [int32](#int32) |  | mention author |






<a name="dialog.events.Event.Reactions"></a>

### Event.Reactions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [dialog.Peer](#dialog.Peer) |  | dialog where mentioned |
| mid | [dialog.UUIDValue](#dialog.UUIDValue) |  | id of message that has reactions |
| reactions | [Event.Reactions.Reaction](#dialog.events.Event.Reactions.Reaction) | repeated |  |






<a name="dialog.events.Event.Reactions.Reaction"></a>

### Event.Reactions.Reaction



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| code | [string](#string) |  | emoji |
| users | [Event.Reactions.Reaction.UsersEntry](#dialog.events.Event.Reactions.Reaction.UsersEntry) | repeated | userId to time when reaction is set by user |






<a name="dialog.events.Event.Reactions.Reaction.UsersEntry"></a>

### Event.Reactions.Reaction.UsersEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [int32](#int32) |  |  |
| value | [int64](#int64) |  |  |






<a name="dialog.events.Event.Reply"></a>

### Event.Reply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [dialog.Peer](#dialog.Peer) |  | dialog where replied |
| mid | [dialog.UUIDValue](#dialog.UUIDValue) |  | id of message where replied |
| user | [int32](#int32) |  | message author |






<a name="dialog.events.LoadEventsRequest"></a>

### LoadEventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| from_clock | [int64](#int64) |  | clock to load from |
| load_mode | [LoadMode](#dialog.events.LoadMode) |  |  |
| limit | [int32](#int32) |  | how much to load |






<a name="dialog.events.LoadEventsResponse"></a>

### LoadEventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| events | [Event](#dialog.events.Event) | repeated |  |
| clock | [int64](#int64) |  | clock of last event |
| next_available | [bool](#bool) |  | is there more to load to requested direction |






<a name="dialog.events.UpdateEvent"></a>

### UpdateEvent



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| event | [Event](#dialog.events.Event) |  |  |
| prev_clock | [int64](#int64) |  | time of previous event |





 


<a name="dialog.events.LoadMode"></a>

### LoadMode


| Name | Number | Description |
| ---- | ------ | ----------- |
| LOADMODE_UNKNOWN | 0 |  |
| LOADMODE_FORWARD | 1 | load from clock to future |
| LOADMODE_BACKWARD | 2 | load from clock to past |


 

 


<a name="dialog.events.Events"></a>

### Events


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| LoadEvents | [LoadEventsRequest](#dialog.events.LoadEventsRequest) | [LoadEventsResponse](#dialog.events.LoadEventsResponse) |  |

 



<a name="gateway_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## gateway_service.proto



<a name="dialog.GetDifferenceCommand"></a>

### GetDifferenceCommand



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| state | [bytes](#bytes) |  |  |
| configHash | [int64](#int64) |  |  |






<a name="dialog.ServiceUpdate"></a>

### ServiceUpdate



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| obsoleteUpdate | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |





 

 

 

 



<a name="groups.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## groups.proto



<a name="dialog.Group"></a>

### Group
Group information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  | group id |
| access_hash | [int64](#int64) |  | Access hash of group |
| data | [GroupData](#dialog.GroupData) |  |  |
| self_member | [Member](#dialog.Member) |  |  |
| title | [string](#string) |  | For old bot sdk compatibility

/ Title of group |
| group_type | [GroupType](#dialog.GroupType) |  | Group Type. Used only for displaying information. Default is GROUP. |
| shortname | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Group short name |






<a name="dialog.GroupData"></a>

### GroupData



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| space_id | [UUIDValue](#dialog.UUIDValue) |  |  |
| title | [string](#string) |  | Title of group |
| avatar | [Avatar](#dialog.Avatar) |  | Avatar of group |
| members_amount | [int32](#int32) |  | Number of members |
| group_type | [GroupType](#dialog.GroupType) |  | Group Type. Used only for displaying information. Default is GROUP. |
| owner_user_id | [int32](#int32) |  | Group creator |
| created_at | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  | Date of creation |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | About of group |
| shortname | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Group short name |
| base_permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated |  |
| clock | [int64](#int64) |  |  |
| pinned_at | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |
| conference_link | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| members_count_limit | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| deleted_at | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |






<a name="dialog.GroupMemberPermission"></a>

### GroupMemberPermission
A struct mapping a group member to their permissions
userId the id of the group member
permissions a list of permissions that user has


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_id | [int32](#int32) |  |  |
| permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated |  |






<a name="dialog.GroupPartialInfo"></a>

### GroupPartialInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  |  |
| access_hash | [int64](#int64) |  |  |
| clock | [int64](#int64) |  |  |
| type | [GroupType](#dialog.GroupType) |  |  |
| title | [string](#string) |  |  |
| shortname | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| avatar | [Avatar](#dialog.Avatar) |  |  |
| self_member | [Member](#dialog.Member) |  |  |
| pinned_at | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |






<a name="dialog.Member"></a>

### Member
Member information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| invited_at | [int64](#int64) |  |  |
| permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated | List of member permissions |
| clock | [int64](#int64) |  |  |
| deleted_at | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="dialog.RequestCreateGroup"></a>

### RequestCreateGroup
Creating group chat


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rid | [int64](#int64) |  | Id for query deduplication |
| space_id | [UUIDValue](#dialog.UUIDValue) |  |  |
| title | [string](#string) |  |  |
| users | [UserOutPeer](#dialog.UserOutPeer) | repeated | members |
| group_type | [GroupType](#dialog.GroupType) |  | group or channel |
| username | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | optional shortname of a group, group will be public if set |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated | Optimizations drops some info from response to decrease traffic and latency |
| base_permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated | Base permissions for invited members |






<a name="dialog.RequestDeleteGroup"></a>

### RequestDeleteGroup



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |






<a name="dialog.RequestEditGroupAbout"></a>

### RequestEditGroupAbout
Edit Group About


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| rid | [int64](#int64) |  | Id for query deduplication |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated | Optimizations drops some info from response to decrease traffic and latency |






<a name="dialog.RequestEditGroupAvatar"></a>

### RequestEditGroupAvatar
Changing group avatar


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| rid | [int64](#int64) |  | Id for query deduplication |
| file_location | [FileLocation](#dialog.FileLocation) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated | Optimizations drops some info from response to decrease traffic and latency |






<a name="dialog.RequestEditGroupBasePermissions"></a>

### RequestEditGroupBasePermissions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| random_id | [int64](#int64) |  | Id for query deduplication |
| granted_permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated |  |
| revoked_permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated |  |






<a name="dialog.RequestEditGroupTitle"></a>

### RequestEditGroupTitle
Changing group title


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| rid | [int64](#int64) |  | Id for query deduplication |
| title | [string](#string) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated | Optimizations drops some info from response to decrease traffic and latency |






<a name="dialog.RequestEditMemberPermissions"></a>

### RequestEditMemberPermissions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| user_peer | [UserOutPeer](#dialog.UserOutPeer) |  |  |
| granted_permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated |  |
| revoked_permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated |  |






<a name="dialog.RequestGetGroupInviteUrl"></a>

### RequestGetGroupInviteUrl
Building invite url


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |






<a name="dialog.RequestGetGroupInviteUrlBase"></a>

### RequestGetGroupInviteUrlBase
Get group invite url base






<a name="dialog.RequestGetGroupMemberPermissions"></a>

### RequestGetGroupMemberPermissions
Fetches the group administration permissions for each of the users from the list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| user_ids | [int32](#int32) | repeated |  |






<a name="dialog.RequestGetGroupPartialInfo"></a>

### RequestGetGroupPartialInfo
get group info by invite token


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |






<a name="dialog.RequestInviteUser"></a>

### RequestInviteUser
Inviting user to group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| rid | [int64](#int64) |  | Id for query deduplication |
| user | [UserOutPeer](#dialog.UserOutPeer) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated | Optimizations drops some info from response to decrease traffic and latency |






<a name="dialog.RequestJoinGroup"></a>

### RequestJoinGroup
Join group method


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestJoinGroupByPeer"></a>

### RequestJoinGroupByPeer
Join group by peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |






<a name="dialog.RequestKickUser"></a>

### RequestKickUser
Kicking user from group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| rid | [int64](#int64) |  | Id for query deduplication |
| user | [UserOutPeer](#dialog.UserOutPeer) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated | Optimizations drops some info from response to decrease traffic and latency |






<a name="dialog.RequestLeaveGroup"></a>

### RequestLeaveGroup
Leaving group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| rid | [int64](#int64) |  | Id for query deduplication |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated | Optimizations drops some info from response to decrease traffic and latency |






<a name="dialog.RequestLoadMembers"></a>

### RequestLoadMembers
Loading group members


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| limit | [int32](#int32) |  |  |
| next | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | cursor |






<a name="dialog.RequestMakeUserAdmin"></a>

### RequestMakeUserAdmin
Make user admin


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| user_peer | [UserOutPeer](#dialog.UserOutPeer) |  |  |
| permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated |  |






<a name="dialog.RequestRemoveGroupAvatar"></a>

### RequestRemoveGroupAvatar
Removing group avatar


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| rid | [int64](#int64) |  | Id for query deduplication |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated | Optimizations drops some info from response to decrease traffic and latency |






<a name="dialog.RequestRevokeInviteUrl"></a>

### RequestRevokeInviteUrl
Revoking invite urls


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |






<a name="dialog.RequestSetGroupShortname"></a>

### RequestSetGroupShortname
Sets group short name


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| shortname | [string](#string) |  | if shortname was empty, then group will become public |






<a name="dialog.RequestTransferOwnership"></a>

### RequestTransferOwnership
Transfer ownership of group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| new_owner | [int32](#int32) |  |  |






<a name="dialog.ResponseCreateGroup"></a>

### ResponseCreateGroup



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  | deprecated |
| state | [bytes](#bytes) |  |  |
| group | [Group](#dialog.Group) |  | created group |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated | empty if dropped by optimizations |






<a name="dialog.ResponseEditGroupAvatar"></a>

### ResponseEditGroupAvatar



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| avatar | [Avatar](#dialog.Avatar) |  |  |
| seq | [int32](#int32) |  | deprecated |
| state | [bytes](#bytes) |  |  |
| date | [int64](#int64) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  |  |






<a name="dialog.ResponseGetGroupInviteUrlBase"></a>

### ResponseGetGroupInviteUrlBase



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| url | [string](#string) |  |  |






<a name="dialog.ResponseGetGroupMemberPermissions"></a>

### ResponseGetGroupMemberPermissions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| permissions | [GroupMemberPermission](#dialog.GroupMemberPermission) | repeated |  |






<a name="dialog.ResponseInviteUrl"></a>

### ResponseInviteUrl
Response for invite url methods


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| url | [string](#string) |  |  |






<a name="dialog.ResponseJoinGroup"></a>

### ResponseJoinGroup



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [Group](#dialog.Group) |  |  |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated | empty if dropped by optimizations |
| mid | [UUIDValue](#dialog.UUIDValue) |  | deprecated |
| seq | [int32](#int32) |  | deprecated |
| state | [bytes](#bytes) |  |  |
| date | [int64](#int64) |  |  |






<a name="dialog.ResponseLoadMembers"></a>

### ResponseLoadMembers



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cursor | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |
| members | [Member](#dialog.Member) | repeated |  |






<a name="dialog.ResponseMember"></a>

### ResponseMember



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| member | [Member](#dialog.Member) |  |  |






<a name="dialog.UpdateGroup"></a>

### UpdateGroup
Update about group data changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  |  |
| data | [GroupData](#dialog.GroupData) |  |  |






<a name="dialog.UpdateGroupAboutChanged"></a>

### UpdateGroupAboutChanged
Update about about changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.UpdateGroupAboutChangedObsolete"></a>

### UpdateGroupAboutChangedObsolete
Update about group about change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.UpdateGroupAvatarChanged"></a>

### UpdateGroupAvatarChanged
Update about avatar changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| avatar | [Avatar](#dialog.Avatar) |  |  |






<a name="dialog.UpdateGroupAvatarChangedObsolete"></a>

### UpdateGroupAvatarChangedObsolete
Update about group avatar change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | deprecated |
| uid | [int32](#int32) |  |  |
| avatar | [Avatar](#dialog.Avatar) |  |  |
| date | [int64](#int64) |  |  |






<a name="dialog.UpdateGroupBasePermissionsChanged"></a>

### UpdateGroupBasePermissionsChanged
Update about base group permissions changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| base_permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated | new base permissions |






<a name="dialog.UpdateGroupInviteObsolete"></a>

### UpdateGroupInviteObsolete
Update notifies that current user got invited to the group
@deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| rid | [int64](#int64) |  | deprecated |
| mid | [UUIDValue](#dialog.UUIDValue) |  | deprecated |
| invite_uid | [int32](#int32) |  |  |
| date | [int64](#int64) |  |  |






<a name="dialog.UpdateGroupMemberDiff"></a>

### UpdateGroupMemberDiff
Update about members changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| removed_users | [int32](#int32) | repeated |  |
| added_members | [Member](#dialog.Member) | repeated |  |
| members_count | [int32](#int32) |  |  |






<a name="dialog.UpdateGroupMemberInvited"></a>

### UpdateGroupMemberInvited
Update notifies that some user got invited to the group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| member | [Member](#dialog.Member) |  |  |






<a name="dialog.UpdateGroupMemberPermissionsChanged"></a>

### UpdateGroupMemberPermissionsChanged
Update about the user&#39;s permissions


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| user_id | [int32](#int32) |  |  |
| permissions | [GroupAdminPermission](#dialog.GroupAdminPermission) | repeated |  |






<a name="dialog.UpdateGroupMembersCountChanged"></a>

### UpdateGroupMembersCountChanged
Update about members count changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| members_count | [int32](#int32) |  |  |






<a name="dialog.UpdateGroupMembersUpdateObsolete"></a>

### UpdateGroupMembersUpdateObsolete
Silent group members update


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| members | [Member](#dialog.Member) | repeated |  |






<a name="dialog.UpdateGroupMembersUpdated"></a>

### UpdateGroupMembersUpdated
Update about members updated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| members | [Member](#dialog.Member) | repeated |  |






<a name="dialog.UpdateGroupOwnerChanged"></a>

### UpdateGroupOwnerChanged
Update about owner changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| user_id | [int32](#int32) |  | new owner |






<a name="dialog.UpdateGroupShortnameChanged"></a>

### UpdateGroupShortnameChanged
Update group short name


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| shortname | [string](#string) |  |  |
| uid | [int32](#int32) |  |  |






<a name="dialog.UpdateGroupTitleChanged"></a>

### UpdateGroupTitleChanged
Update about title changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| title | [string](#string) |  |  |






<a name="dialog.UpdateGroupTitleChangedObsolete"></a>

### UpdateGroupTitleChangedObsolete
Update about group title change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | deprecated |
| uid | [int32](#int32) |  |  |
| title | [string](#string) |  |  |
| date | [int64](#int64) |  |  |






<a name="dialog.UpdateGroupUserInvitedObsolete"></a>

### UpdateGroupUserInvitedObsolete
Update notifies that some user got invited to the group
@deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| rid | [int64](#int64) |  | Id for deduplication |
| mid | [UUIDValue](#dialog.UUIDValue) |  | deprecated |
| uid | [int32](#int32) |  |  |
| inviter_uid | [int32](#int32) |  |  |
| date | [int64](#int64) |  |  |






<a name="dialog.UpdateGroupUserKickObsolete"></a>

### UpdateGroupUserKickObsolete
Update about kicking user


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | deprecated |
| uid | [int32](#int32) |  |  |
| kicker_uid | [int32](#int32) |  |  |
| date | [int64](#int64) |  |  |






<a name="dialog.UpdateGroupUserLeaveObsolete"></a>

### UpdateGroupUserLeaveObsolete
Update about leaving user


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | deprecated |
| uid | [int32](#int32) |  |  |
| date | [int64](#int64) |  |  |





 


<a name="dialog.GroupAdminPermission"></a>

### GroupAdminPermission
Possible permissions on a group

| Name | Number | Description |
| ---- | ------ | ----------- |
| GROUPADMINPERMISSION_UNKNOWN | 0 |  |
| GROUPADMINPERMISSION_EDITSHORTNAME | 1 |  |
| GROUPADMINPERMISSION_INVITE | 2 |  |
| GROUPADMINPERMISSION_KICK | 3 |  |
| GROUPADMINPERMISSION_UPDATEINFO | 4 |  |
| GROUPADMINPERMISSION_SETPERMISSIONS | 5 |  |
| GROUPADMINPERMISSION_EDITMESSAGE | 6 |  |
| GROUPADMINPERMISSION_DELETEMESSAGE | 7 |  |
| GROUPADMINPERMISSION_GETINTEGRATIONTOKEN | 8 |  |
| GROUPADMINPERMISSION_SENDMESSAGE | 9 |  |
| GROUPADMINPERMISSION_PINMESSAGE | 10 |  |
| GROUPADMINPERMISSION_VIEWMEMBERS | 11 |  |
| GROUPADMINPERMISSION_LEAVE | 12 | read only permission |
| GROUPADMINPERMISSION_TARGETING | 13 |  |
| GROUPADMINPERMISSION_DELETE | 14 |  |
| GROUPADMINPERMISSION_MANAGE_CONFERENCE | 15 |  |



<a name="dialog.GroupType"></a>

### GroupType


| Name | Number | Description |
| ---- | ------ | ----------- |
| GROUPTYPE_UNKNOWN | 0 |  |
| GROUPTYPE_GROUP | 1 |  |
| GROUPTYPE_CHANNEL | 2 |  |
| GROUPTYPE_THREAD | 4 |  |


 

 


<a name="dialog.Groups"></a>

### Groups


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| LoadMembers | [RequestLoadMembers](#dialog.RequestLoadMembers) | [ResponseLoadMembers](#dialog.ResponseLoadMembers) |  |
| CreateGroup | [RequestCreateGroup](#dialog.RequestCreateGroup) | [ResponseCreateGroup](#dialog.ResponseCreateGroup) |  |
| EditGroupTitle | [RequestEditGroupTitle](#dialog.RequestEditGroupTitle) | [ResponseSeqDateMid](#dialog.ResponseSeqDateMid) |  |
| SetGroupShortname | [RequestSetGroupShortname](#dialog.RequestSetGroupShortname) | [ResponseSeq](#dialog.ResponseSeq) |  |
| EditGroupAvatar | [RequestEditGroupAvatar](#dialog.RequestEditGroupAvatar) | [ResponseEditGroupAvatar](#dialog.ResponseEditGroupAvatar) |  |
| RemoveGroupAvatar | [RequestRemoveGroupAvatar](#dialog.RequestRemoveGroupAvatar) | [ResponseSeqDateMid](#dialog.ResponseSeqDateMid) |  |
| EditGroupAbout | [RequestEditGroupAbout](#dialog.RequestEditGroupAbout) | [ResponseSeqDate](#dialog.ResponseSeqDate) |  |
| EditGroupBasePermissions | [RequestEditGroupBasePermissions](#dialog.RequestEditGroupBasePermissions) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| InviteUser | [RequestInviteUser](#dialog.RequestInviteUser) | [ResponseSeqDateMid](#dialog.ResponseSeqDateMid) |  |
| LeaveGroup | [RequestLeaveGroup](#dialog.RequestLeaveGroup) | [ResponseSeqDateMid](#dialog.ResponseSeqDateMid) |  |
| KickUser | [RequestKickUser](#dialog.RequestKickUser) | [ResponseSeqDateMid](#dialog.ResponseSeqDateMid) |  |
| MakeUserAdmin | [RequestMakeUserAdmin](#dialog.RequestMakeUserAdmin) | [ResponseSeqDate](#dialog.ResponseSeqDate) |  |
| GetGroupMemberPermissions | [RequestGetGroupMemberPermissions](#dialog.RequestGetGroupMemberPermissions) | [ResponseGetGroupMemberPermissions](#dialog.ResponseGetGroupMemberPermissions) |  |
| EditMemberPermissions | [RequestEditMemberPermissions](#dialog.RequestEditMemberPermissions) | [ResponseMember](#dialog.ResponseMember) |  |
| TransferOwnership | [RequestTransferOwnership](#dialog.RequestTransferOwnership) | [ResponseSeqDate](#dialog.ResponseSeqDate) |  |
| GetGroupInviteUrl | [RequestGetGroupInviteUrl](#dialog.RequestGetGroupInviteUrl) | [ResponseInviteUrl](#dialog.ResponseInviteUrl) |  |
| GetGroupInviteUrlBase | [RequestGetGroupInviteUrlBase](#dialog.RequestGetGroupInviteUrlBase) | [ResponseGetGroupInviteUrlBase](#dialog.ResponseGetGroupInviteUrlBase) |  |
| RevokeInviteUrl | [RequestRevokeInviteUrl](#dialog.RequestRevokeInviteUrl) | [ResponseInviteUrl](#dialog.ResponseInviteUrl) |  |
| JoinGroup | [RequestJoinGroup](#dialog.RequestJoinGroup) | [ResponseJoinGroup](#dialog.ResponseJoinGroup) |  |
| JoinGroupByPeer | [RequestJoinGroupByPeer](#dialog.RequestJoinGroupByPeer) | [ResponseVoid](#dialog.ResponseVoid) |  |
| DeleteGroup | [RequestDeleteGroup](#dialog.RequestDeleteGroup) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| GetGroupPartialInfo | [RequestGetGroupPartialInfo](#dialog.RequestGetGroupPartialInfo) | [GroupPartialInfo](#dialog.GroupPartialInfo) |  |

 



<a name="integrations.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## integrations.proto



<a name="dialog.RequestGetIntegrationToken"></a>

### RequestGetIntegrationToken
Getting current group token


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.RequestRevokeIntegrationToken"></a>

### RequestRevokeIntegrationToken
Revoke group token


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.ResponseIntegrationToken"></a>

### ResponseIntegrationToken
Group token response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |
| url | [string](#string) |  |  |





 

 

 


<a name="dialog.Integrations"></a>

### Integrations


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetIntegrationToken | [RequestGetIntegrationToken](#dialog.RequestGetIntegrationToken) | [ResponseIntegrationToken](#dialog.ResponseIntegrationToken) | Get token for posting to group |
| RevokeIntegrationToken | [RequestRevokeIntegrationToken](#dialog.RequestRevokeIntegrationToken) | [ResponseIntegrationToken](#dialog.ResponseIntegrationToken) | Revoke token |

 



<a name="media_and_files.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## media_and_files.proto



<a name="dialog.AudioLocation"></a>

### AudioLocation
Audio location


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file_location | [FileLocation](#dialog.FileLocation) |  | File location |
| duration | [int32](#int32) |  | audio duration in seconds |
| mime_type | [string](#string) |  | mime type |
| file_size | [int32](#int32) |  | file size |






<a name="dialog.Avatar"></a>

### Avatar
Avatar of User or Group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| small_image | [AvatarImage](#dialog.AvatarImage) |  | Optional small image of avatar box in 100x100 |
| large_image | [AvatarImage](#dialog.AvatarImage) |  | Optional large image of avatar box in 200x200 |
| full_image | [AvatarImage](#dialog.AvatarImage) |  | Optional full screen image of avatar |






<a name="dialog.AvatarImage"></a>

### AvatarImage
Avatar Image


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file_location | [FileLocation](#dialog.FileLocation) |  | Location of file |
| width | [int32](#int32) |  | Width of avatar image |
| height | [int32](#int32) |  | Height of avatar image |
| file_size | [int32](#int32) |  | Size of file |






<a name="dialog.Color"></a>

### Color



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rgb | [RgbColor](#dialog.RgbColor) |  |  |
| predefined | [PredefinedColor](#dialog.PredefinedColor) |  |  |






<a name="dialog.FastThumb"></a>

### FastThumb
Fast thumb of media messages. Less than 90x90 and compressed by JPEG with low quality


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| w | [int32](#int32) |  | Width of thumb |
| h | [int32](#int32) |  | Height of thump |
| thumb | [bytes](#bytes) |  | compressed image data |






<a name="dialog.FileLocation"></a>

### FileLocation
Location of file on server


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file_id | [int64](#int64) |  | Unique Id of file |
| access_hash | [int64](#int64) |  | Access hash of file |






<a name="dialog.FileUrlDescription"></a>

### FileUrlDescription
File url description


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file_id | [int64](#int64) |  | File id of url |
| url | [string](#string) |  | Url for downloading |
| timeout | [int32](#int32) |  | Timeout of url |
| unsigned_url | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Unsigned URL (used to honor web caches) |
| unsigned_url_headers | [HTTPHeader](#dialog.HTTPHeader) | repeated | Headers that is required to download files with unsigned url |
| md5_hash | [bytes](#bytes) |  |  |






<a name="dialog.FileUrlError"></a>

### FileUrlError
Error, that describes failure of specific file


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file_id | [int64](#int64) |  | the id of file |
| tag | [FileUrlError.ErrorTag](#dialog.FileUrlError.ErrorTag) |  | error to handle on client |
| reason | [string](#string) |  | text fallback |
| retryable | [bool](#bool) |  | client should retry or not |






<a name="dialog.HTTPHeader"></a>

### HTTPHeader
HTTP Header record


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  | HTTP Header name |
| value | [string](#string) |  | HTTP Header value |






<a name="dialog.ImageLocation"></a>

### ImageLocation
Image location


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file_location | [FileLocation](#dialog.FileLocation) |  | Location of file |
| width | [int32](#int32) |  | Width of avatar image |
| height | [int32](#int32) |  | Height of avatar image |
| file_size | [int32](#int32) |  | Size of file |






<a name="dialog.PredefinedColor"></a>

### PredefinedColor
Predefined color


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| color | [Colors](#dialog.Colors) |  | Predefined color value |






<a name="dialog.RequestCommitFileUpload"></a>

### RequestCommitFileUpload
Comminting uploaded file to storage


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| upload_key | [bytes](#bytes) |  |  |
| file_name | [string](#string) |  |  |
| md5_hash | [bytes](#bytes) |  |  |






<a name="dialog.RequestGetFileUploadPartUrl"></a>

### RequestGetFileUploadPartUrl
Upload file part


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| part_number | [int32](#int32) |  |  |
| part_size | [int32](#int32) |  |  |
| upload_key | [bytes](#bytes) |  |  |






<a name="dialog.RequestGetFileUploadUrl"></a>

### RequestGetFileUploadUrl
Requesting pload url


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| expected_size | [int32](#int32) |  |  |






<a name="dialog.RequestGetFileUrl"></a>

### RequestGetFileUrl
Requesting file URL for downloading


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file | [FileLocation](#dialog.FileLocation) |  |  |






<a name="dialog.RequestGetFileUrlBuilder"></a>

### RequestGetFileUrlBuilder
Get File URL Builder that allows to build file urls from client side


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| supported_signature_algorithms | [string](#string) | repeated |  |






<a name="dialog.RequestGetFileUrls"></a>

### RequestGetFileUrls
Requesting multiple fle URL for downloading


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| files | [FileLocation](#dialog.FileLocation) | repeated |  |






<a name="dialog.ResponseCommitFileUpload"></a>

### ResponseCommitFileUpload



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uploaded_file_location | [FileLocation](#dialog.FileLocation) |  |  |






<a name="dialog.ResponseGetFileUploadPartUrl"></a>

### ResponseGetFileUploadPartUrl



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| url | [string](#string) |  |  |






<a name="dialog.ResponseGetFileUploadUrl"></a>

### ResponseGetFileUploadUrl



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| url | [string](#string) |  |  |
| upload_key | [bytes](#bytes) |  |  |






<a name="dialog.ResponseGetFileUrl"></a>

### ResponseGetFileUrl



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| url | [string](#string) |  |  |
| timeout | [int32](#int32) |  |  |
| unsigned_url | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| unsigned_url_headers | [HTTPHeader](#dialog.HTTPHeader) | repeated |  |
| md5_hash | [bytes](#bytes) |  |  |






<a name="dialog.ResponseGetFileUrlBuilder"></a>

### ResponseGetFileUrlBuilder



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| base_url | [string](#string) |  |  |
| algo | [string](#string) |  |  |
| seed | [string](#string) |  |  |
| signature_secret | [bytes](#bytes) |  |  |
| timeout | [int32](#int32) |  |  |






<a name="dialog.ResponseGetFileUrls"></a>

### ResponseGetFileUrls



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file_urls | [FileUrlDescription](#dialog.FileUrlDescription) | repeated |  |
| errors | [FileUrlError](#dialog.FileUrlError) | repeated |  |






<a name="dialog.RgbColor"></a>

### RgbColor
RGB Color


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rgb | [int32](#int32) |  | RGB color value |





 


<a name="dialog.Colors"></a>

### Colors


| Name | Number | Description |
| ---- | ------ | ----------- |
| COLORS_UNKNOWN | 0 |  |
| COLORS_RED | 1 |  |
| COLORS_YELLOW | 2 |  |
| COLORS_GREEN | 3 |  |



<a name="dialog.FileUrlError.ErrorTag"></a>

### FileUrlError.ErrorTag


| Name | Number | Description |
| ---- | ------ | ----------- |
| FILEURLERROR_UNKNOWN | 0 |  |
| FILEURLERROR_STORAGE_ERROR | 1 |  |
| FILEURLERROR_STORAGE_FORBIDDEN_ERROR | 2 |  |


 

 


<a name="dialog.MediaAndFiles"></a>

### MediaAndFiles


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetFileUrl | [RequestGetFileUrl](#dialog.RequestGetFileUrl) | [ResponseGetFileUrl](#dialog.ResponseGetFileUrl) | Get link to file for downloading |
| GetFileUrls | [RequestGetFileUrls](#dialog.RequestGetFileUrls) | [ResponseGetFileUrls](#dialog.ResponseGetFileUrls) | Get link to files for downloading |
| GetFileUrlBuilder | [RequestGetFileUrlBuilder](#dialog.RequestGetFileUrlBuilder) | [ResponseGetFileUrlBuilder](#dialog.ResponseGetFileUrlBuilder) | Create builder for file url |
| GetFileUploadUrl | [RequestGetFileUploadUrl](#dialog.RequestGetFileUploadUrl) | [ResponseGetFileUploadUrl](#dialog.ResponseGetFileUploadUrl) | Get url for uploading |
| CommitFileUpload | [RequestCommitFileUpload](#dialog.RequestCommitFileUpload) | [ResponseCommitFileUpload](#dialog.ResponseCommitFileUpload) | Finish uploading a file |
| GetFileUploadPartUrl | [RequestGetFileUploadPartUrl](#dialog.RequestGetFileUploadPartUrl) | [ResponseGetFileUploadPartUrl](#dialog.ResponseGetFileUploadPartUrl) | Get url for uploading chunk of file |

 



<a name="messaging.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## messaging.proto



<a name="dialog.AudioMedia"></a>

### AudioMedia
Audio media


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| audio | [AudioLocation](#dialog.AudioLocation) |  |  |






<a name="dialog.BinaryMessage"></a>

### BinaryMessage
Binary Message. Useful for implementing your own content types


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| content_tag | [string](#string) |  |  |
| msg | [bytes](#bytes) |  |  |






<a name="dialog.DeletedMessage"></a>

### DeletedMessage
Deleted message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| is_local | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Deleted locally message |






<a name="dialog.Dialog"></a>

### Dialog
Conversation from history
peer
unreadCount
sortDate date of conversation for sorting
senderUid Sender of top message (may be zero)
isFavourite Is dialog favourite
rid Random ID of top message (may be zero)
mid Message id
date Date of top message (can&#39;t be zero)
message Content of message
firstUnreadDate Date of first unread message
attributes Optional top message attributes
pinnedMessages Optional pinned messages
historyMessage Optional last messages


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  | Peer of conversation |
| unread_count | [int32](#int32) |  | counter of unread messages |
| sort_date | [int64](#int64) |  | deprecated |
| sender_uid | [int32](#int32) |  |  |
| is_favourite | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| date | [int64](#int64) |  | last action date |
| message | [MessageContent](#dialog.MessageContent) |  | last message content |
| state | [MessageState](#dialog.MessageState) |  |  |
| first_unread_date | [int64](#int64) |  |  |
| attributes | [MessageAttributes](#dialog.MessageAttributes) |  |  |
| pinned_messages | [PinnedMessages](#dialog.PinnedMessages) |  |  |
| history_message | [HistoryMessage](#dialog.HistoryMessage) |  | last message in this dialog |
| last_receive | [int64](#int64) |  |  |
| last_read | [int64](#int64) |  |  |
| last_reaction_at | [int64](#int64) |  |  |
| read_later | [bool](#bool) |  |  |






<a name="dialog.DialogData"></a>

### DialogData
Data related to dialog entity


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| is_favourite | [bool](#bool) |  |  |
| created_at | [int64](#int64) |  |  |
| clock | [int64](#int64) |  | When dialog was changed last time |






<a name="dialog.DialogGroup"></a>

### DialogGroup
Grouped dialog list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| title | [string](#string) |  |  |
| key | [string](#string) |  |  |
| dialogs | [DialogShort](#dialog.DialogShort) | repeated |  |






<a name="dialog.DialogIndex"></a>

### DialogIndex



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  | The peer for the conversation |
| last_message_date | [int64](#int64) |  | Last message date of a dialog |
| data | [DialogData](#dialog.DialogData) |  |  |






<a name="dialog.DialogListEntry"></a>

### DialogListEntry
Compound info of a one of the dialogs in dialog list SDK 2.0

peer
unread_count count of the unread messages in dialog
my_read_date date of the last own read
last_message_date date of the last message
receive_date date of the last received message
read_date date of the last read message
entry_clock shared clock across all datas which required for making a dialog entry
data data related to dialog itself


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  | Peer of conversation |
| unread_counter_clock | [int64](#int64) |  |  |
| unread_count | [int32](#int32) |  |  |
| my_read_date | [int64](#int64) |  |  |
| last_message_date | [int64](#int64) |  |  |
| receive_date | [int64](#int64) |  |  |
| read_date | [int64](#int64) |  |  |
| entry_clock | [int64](#int64) |  |  |
| last_update_of_message_date | [int64](#int64) |  |  |
| last_reaction_date | [int64](#int64) |  |  |
| read_later | [bool](#bool) |  |  |
| data | [DialogData](#dialog.DialogData) |  |  |






<a name="dialog.DialogShort"></a>

### DialogShort
Short Dialog from grouped conversation list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  | Peer of conversation |
| counter | [int32](#int32) |  | Conversation unread count |
| date | [int64](#int64) |  | Conversation top message date |






<a name="dialog.DocumentEx"></a>

### DocumentEx



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| photo | [DocumentExPhoto](#dialog.DocumentExPhoto) |  |  |
| video | [DocumentExVideo](#dialog.DocumentExVideo) |  |  |
| voice | [DocumentExVoice](#dialog.DocumentExVoice) |  |  |






<a name="dialog.DocumentExPhoto"></a>

### DocumentExPhoto
File photo extension


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| w | [int32](#int32) |  | image width |
| h | [int32](#int32) |  | image height |






<a name="dialog.DocumentExVideo"></a>

### DocumentExVideo
File video extension


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| w | [int32](#int32) |  | video width |
| h | [int32](#int32) |  | video height |
| duration | [int32](#int32) |  |  |






<a name="dialog.DocumentExVoice"></a>

### DocumentExVoice
File voice extension


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| duration | [int32](#int32) |  |  |






<a name="dialog.DocumentMessage"></a>

### DocumentMessage
File message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file_id | [int64](#int64) |  |  |
| access_hash | [int64](#int64) |  |  |
| file_size | [int32](#int32) |  |  |
| name | [string](#string) |  |  |
| mime_type | [string](#string) |  |  |
| thumb | [FastThumb](#dialog.FastThumb) |  | optional thumb of file. JPEG less that 90x90 with 60-70 quality. |
| ext | [DocumentEx](#dialog.DocumentEx) |  |  |
| caption | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| mentions | [Mention](#dialog.Mention) | repeated |  |






<a name="dialog.EmptyMessage"></a>

### EmptyMessage
Empty Message






<a name="dialog.HistoryMessage"></a>

### HistoryMessage
Message from history


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_uid | [int32](#int32) |  |  |
| sender_peer | [OutPeer](#dialog.OutPeer) |  |  |
| host_peer | [OutPeer](#dialog.OutPeer) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id generated by server |
| prev_mid | [UUIDValue](#dialog.UUIDValue) |  |  |
| date | [int64](#int64) |  |  |
| message | [MessageContent](#dialog.MessageContent) |  |  |
| state | [MessageState](#dialog.MessageState) |  |  |
| reactions | [MessageReaction](#dialog.MessageReaction) | repeated |  |
| attribute | [MessageAttributes](#dialog.MessageAttributes) |  |  |
| forward | [ReferencedMessages](#dialog.ReferencedMessages) |  |  |
| reply | [ReferencedMessages](#dialog.ReferencedMessages) |  |  |
| edited_at | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |
| random_id | [int64](#int64) |  |  |






<a name="dialog.HistoryMessageLight"></a>

### HistoryMessageLight



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_uid | [int32](#int32) |  |  |
| message_id | [UUIDValue](#dialog.UUIDValue) |  | Message id generated by server |
| date | [int64](#int64) |  |  |
| message | [MessageContent](#dialog.MessageContent) |  |  |
| forward | [ReferencedMessages](#dialog.ReferencedMessages) |  |  |
| reply | [ReferencedMessages](#dialog.ReferencedMessages) |  |  |
| edited_at | [int64](#int64) |  |  |
| random_id | [int64](#int64) |  |  |






<a name="dialog.ImageMedia"></a>

### ImageMedia
Image media
image image


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| image | [ImageLocation](#dialog.ImageLocation) |  |  |






<a name="dialog.InteractiveMedia"></a>

### InteractiveMedia
A text message extension representing an interactive action.
Can be used to add widgets (such as buttons, selects, etc) to messages.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | identifier of the media action |
| widget | [InteractiveMediaWidget](#dialog.InteractiveMediaWidget) |  | a widget to be shown to user |
| style | [InteractiveMediaStyle](#dialog.InteractiveMediaStyle) |  | a style of the widget, which is interpreted by the client |
| confirm | [InteractiveMediaConfirm](#dialog.InteractiveMediaConfirm) |  | A content of the alert dialog that will be show to user when they perform the media action |






<a name="dialog.InteractiveMediaButton"></a>

### InteractiveMediaButton
A &#39;Button&#39; widget


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  | A value for this button |
| label | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | A user-visible description of this button |






<a name="dialog.InteractiveMediaConfirm"></a>

### InteractiveMediaConfirm
An alert dialog content to show to user


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| text | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | the optional alert dialog prompt |
| title | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | the optional alert dialog title |
| ok | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | the optional confirm button text |
| dismiss | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | the optional cancel button text |






<a name="dialog.InteractiveMediaGroup"></a>

### InteractiveMediaGroup
A group of interactive media actions


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| actions | [InteractiveMedia](#dialog.InteractiveMedia) | repeated | the list of actions |
| title | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | an optional title of the group |
| description | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | an optional description of the group |
| translations | [InteractiveMediaTranslationGroup](#dialog.InteractiveMediaTranslationGroup) | repeated | a media content translations |






<a name="dialog.InteractiveMediaSelect"></a>

### InteractiveMediaSelect
A select from multiple values widget


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| options | [InteractiveMediaSelectOption](#dialog.InteractiveMediaSelectOption) | repeated | list of values to present to user |
| label | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | A user-visible descripton of this select |
| default_value | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | A value that will be selected by default |






<a name="dialog.InteractiveMediaSelectOption"></a>

### InteractiveMediaSelectOption
A row in the select widget


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  | id of the row |
| label | [string](#string) |  | a user visible text for this row |






<a name="dialog.InteractiveMediaTranslation"></a>

### InteractiveMediaTranslation



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="dialog.InteractiveMediaTranslationGroup"></a>

### InteractiveMediaTranslationGroup



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| language | [string](#string) |  | a translation group language |
| messages | [InteractiveMediaTranslation](#dialog.InteractiveMediaTranslation) | repeated | a list of translation mesages |






<a name="dialog.InteractiveMediaWidget"></a>

### InteractiveMediaWidget
Some interactive element inside a message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interactiveMediaButton | [InteractiveMediaButton](#dialog.InteractiveMediaButton) |  |  |
| interactiveMediaSelect | [InteractiveMediaSelect](#dialog.InteractiveMediaSelect) |  |  |






<a name="dialog.JsonMessage"></a>

### JsonMessage
Custom-data JsonMessage


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| raw_json | [string](#string) |  |  |






<a name="dialog.Mention"></a>

### Mention



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| all | [bool](#bool) |  |  |






<a name="dialog.MessageAttributes"></a>

### MessageAttributes
Message Attributes


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| is_mentioned | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Is mentioned. If set overrides built-in value. |
| is_highlighted | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Is message highlighted. Default is false. |
| is_notified | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Is notified. If set overrides built-in settings. |
| is_only_for_you | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | If this message is only for you. Default is false |






<a name="dialog.MessageContent"></a>

### MessageContent



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| textMessage | [TextMessage](#dialog.TextMessage) |  |  |
| serviceMessage | [ServiceMessage](#dialog.ServiceMessage) |  |  |
| documentMessage | [DocumentMessage](#dialog.DocumentMessage) |  |  |
| jsonMessage | [JsonMessage](#dialog.JsonMessage) |  |  |
| unsupportedMessage | [UnsupportedMessage](#dialog.UnsupportedMessage) |  |  |
| stickerMessage | [StickerMessage](#dialog.StickerMessage) |  |  |
| binaryMessage | [BinaryMessage](#dialog.BinaryMessage) |  |  |
| emptyMessage | [EmptyMessage](#dialog.EmptyMessage) |  |  |
| deletedMessage | [DeletedMessage](#dialog.DeletedMessage) |  |  |






<a name="dialog.MessageMedia"></a>

### MessageMedia
Message media


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| webpage | [WebpageMedia](#dialog.WebpageMedia) |  |  |
| image | [ImageMedia](#dialog.ImageMedia) |  |  |
| audio | [AudioMedia](#dialog.AudioMedia) |  |  |
| actions | [InteractiveMediaGroup](#dialog.InteractiveMediaGroup) | repeated |  |






<a name="dialog.MessageReaction"></a>

### MessageReaction
Reaction to message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [int32](#int32) | repeated | User&#39;s reaction |
| code | [string](#string) |  | Reaction EMOJI code |






<a name="dialog.MessageStatus"></a>

### MessageStatus
The model describing when a user received or read a message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| clock | [int64](#int64) |  | time when message was read or received |
| user_id | [int32](#int32) |  |  |






<a name="dialog.ParagraphStyle"></a>

### ParagraphStyle
Paragraph style


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| show_paragraph | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Show quote-like paragraph? |
| paragraph_color | [Color](#dialog.Color) |  | Override paragraph color |
| bg_color | [Color](#dialog.Color) |  | Override background color |






<a name="dialog.PinnedMessages"></a>

### PinnedMessages
Pinned messages


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mids | [UUIDValue](#dialog.UUIDValue) | repeated | Messages ids |






<a name="dialog.QuotedMessage"></a>

### QuotedMessage
Quoted Message
messageId
publicGroupId
senderUserId
messageDate
quotedMessageContent


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message_id | [int64](#int64) |  | Message Id if present |
| public_group_id | [int32](#int32) |  | Public Group id if present |
| sender_user_id | [int32](#int32) |  | Sender of message |
| message_date | [int64](#int64) |  | Date of message |
| quoted_message_content | [MessageContent](#dialog.MessageContent) |  | Optional Quoted Message Content. Can be empty if messageId is present and message is in current peer. |






<a name="dialog.ReferencedMessages"></a>

### ReferencedMessages
mids Referenced message ids


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mids | [UUIDValue](#dialog.UUIDValue) | repeated |  |






<a name="dialog.RequestArchiveChat"></a>

### RequestArchiveChat
Archiving chat


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.RequestClearChat"></a>

### RequestClearChat
Clearing of conversation (without removing dialog from dialogs list)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| last_message_date | [int64](#int64) |  |  |






<a name="dialog.RequestCountForeignMessages"></a>

### RequestCountForeignMessages



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| from_date | [int64](#int64) |  |  |






<a name="dialog.RequestDeleteChat"></a>

### RequestDeleteChat
Deleting of conversation (also leave group for group conversations)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| last_message_date | [int64](#int64) |  |  |






<a name="dialog.RequestDeleteMessage"></a>

### RequestDeleteMessage
Deleting message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| message_id | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| delete_for_user_only | [bool](#bool) |  |  |






<a name="dialog.RequestDeleteMessageObsolete"></a>

### RequestDeleteMessageObsolete
Deleting messages


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mids | [UUIDValue](#dialog.UUIDValue) | repeated | Message ids |






<a name="dialog.RequestDialogListDifference"></a>

### RequestDialogListDifference
Loading compound difference (all dialogs after from_clock) as DialogListEntries
Use it to request difference in dialog list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| from_clock | [int64](#int64) |  | Shared clock across all states which required for making a dialog entry (e.g. max clock among those dates) / Conceptually you have to set this to sync all including datas after reconnect or authorization |






<a name="dialog.RequestDoInteractiveMediaAction"></a>

### RequestDoInteractiveMediaAction
Sends a request to do interactive media message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id of the enclosed message |
| id | [string](#string) |  | Media id |
| value | [string](#string) |  | selected value |






<a name="dialog.RequestFavouriteDialog"></a>

### RequestFavouriteDialog
Marking dialog as favourite


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.RequestFetchDialogIndex"></a>

### RequestFetchDialogIndex
Fetches dialog index (short info about all user&#39;s dialogs).
Used in client side pagination.






<a name="dialog.RequestGetLastConversationMessages"></a>

### RequestGetLastConversationMessages
Use it to receive messages for visible dialogs after FetchDialogsIndex


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peers | [Peer](#dialog.Peer) | repeated |  |






<a name="dialog.RequestGetUpdatedMessages"></a>

### RequestGetUpdatedMessages



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| from_clock | [int64](#int64) |  |  |






<a name="dialog.RequestHideDialog"></a>

### RequestHideDialog
Hide Dialog from grouped list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.RequestHistoryDifference"></a>

### RequestHistoryDifference



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| clock | [int64](#int64) |  |  |






<a name="dialog.RequestLoadArchived"></a>

### RequestLoadArchived
Loading archived messages - deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| next_offset | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |
| limit | [int32](#int32) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestLoadDialogs"></a>

### RequestLoadDialogs
Loading conversation history


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| min_date | [int64](#int64) |  |  |
| limit | [int32](#int32) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |
| filters | [DialogsFilter](#dialog.DialogsFilter) | repeated |  |
| peers_to_load | [Peer](#dialog.Peer) | repeated |  |






<a name="dialog.RequestLoadGroupedDialogs"></a>

### RequestLoadGroupedDialogs
Load all dialogs from grouped list - deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestLoadHistory"></a>

### RequestLoadHistory
Loading history of chat


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| date | [int64](#int64) |  |  |
| load_mode | [ListLoadMode](#dialog.ListLoadMode) |  | forward, backward or both |
| limit | [int32](#int32) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestLoadHistoryLight"></a>

### RequestLoadHistoryLight



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| date | [int64](#int64) |  |  |
| load_mode | [ListLoadMode](#dialog.ListLoadMode) |  | forward, backward or both |
| limit | [int32](#int32) |  |  |






<a name="dialog.RequestMessageRead"></a>

### RequestMessageRead
Marking plain messages as read


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| date | [int64](#int64) |  |  |






<a name="dialog.RequestMessageReads"></a>

### RequestMessageReads
Load message statuses for every user in conversation reads


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| limit | [int32](#int32) |  | limit of selection |
| timestamp_from | [int64](#int64) |  | time selection starts from |






<a name="dialog.RequestMessageReceived"></a>

### RequestMessageReceived
Confirmation of plain message receive by device


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| date | [int64](#int64) |  |  |






<a name="dialog.RequestMessageReceives"></a>

### RequestMessageReceives
Load message statuses for every user in conversation receives


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| limit | [int32](#int32) |  | limit of selection |
| timestamp_from | [int64](#int64) |  | time selection starts from |






<a name="dialog.RequestMessageRemoveReaction"></a>

### RequestMessageRemoveReaction
Removing Message reaction


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| code | [string](#string) |  | EMOJI code |






<a name="dialog.RequestMessageSetReaction"></a>

### RequestMessageSetReaction
Setting Message reaction


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| code | [string](#string) |  | EMOJI code |






<a name="dialog.RequestNotifyDialogOpened"></a>

### RequestNotifyDialogOpened
Notifying about dialog open


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.RequestPinMessage"></a>

### RequestPinMessage
Pin message in conversation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| last_pin_date | [int64](#int64) |  |  |






<a name="dialog.RequestReadDialogLater"></a>

### RequestReadDialogLater



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| read_later | [bool](#bool) |  |  |






<a name="dialog.RequestSendMessage"></a>

### RequestSendMessage
Sending plain message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| deduplication_id | [int64](#int64) |  | Id for message deduplication |
| message | [MessageContent](#dialog.MessageContent) |  |  |
| is_only_for_user | [int32](#int32) |  | if not empty, then message will be send to this user only |
| forward | [ReferencedMessages](#dialog.ReferencedMessages) |  | If current message forwards some other |
| reply | [ReferencedMessages](#dialog.ReferencedMessages) |  | If current message is a reply on some other |
| predicates | [SearchPredicate](#dialog.SearchPredicate) | repeated |  |
| white_list | [int32](#int32) | repeated |  |
| black_list | [int32](#int32) | repeated |  |






<a name="dialog.RequestShowDialog"></a>

### RequestShowDialog
Show Dialog in grouped list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.RequestUnfavouriteDialog"></a>

### RequestUnfavouriteDialog
Making dialog as unfavourite


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.RequestUnpinMessage"></a>

### RequestUnpinMessage
Unpin message in conversation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| last_pin_date | [int64](#int64) |  |  |






<a name="dialog.RequestUpdateMessage"></a>

### RequestUpdateMessage
Changing Message content


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| updated_message | [MessageContent](#dialog.MessageContent) |  |  |
| last_edited_at | [int64](#int64) |  | Date from this message when it was changed last time |






<a name="dialog.ResponseCountForeignMessages"></a>

### ResponseCountForeignMessages



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| last_conversation_message_date | [int64](#int64) |  | last conversation message date |
| count | [int32](#int32) |  | counter of the messages between last conversation message (including it) and last returned in this response |






<a name="dialog.ResponseDialogListDifference"></a>

### ResponseDialogListDifference
Contains dialogs that was change after from_clock


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entries | [DialogListEntry](#dialog.DialogListEntry) | repeated |  |
| clock | [int64](#int64) |  | Start and the end of the compound history data interval |
| prev_clock | [int64](#int64) |  |  |






<a name="dialog.ResponseDialogsOrder"></a>

### ResponseDialogsOrder
Dialogs order response - deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |
| groups | [DialogGroup](#dialog.DialogGroup) | repeated |  |






<a name="dialog.ResponseFetchDialogIndex"></a>

### ResponseFetchDialogIndex



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| dialog_indices | [DialogIndex](#dialog.DialogIndex) | repeated |  |






<a name="dialog.ResponseGetLastConversationMessages"></a>

### ResponseGetLastConversationMessages



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| messages | [ResponseGetLastConversationMessages.Pair](#dialog.ResponseGetLastConversationMessages.Pair) | repeated |  |






<a name="dialog.ResponseGetLastConversationMessages.Pair"></a>

### ResponseGetLastConversationMessages.Pair



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| message | [HistoryMessage](#dialog.HistoryMessage) |  |  |






<a name="dialog.ResponseGetUpdatedMessages"></a>

### ResponseGetUpdatedMessages



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| messages | [ResponseGetUpdatedMessages.UpdatedMessage](#dialog.ResponseGetUpdatedMessages.UpdatedMessage) | repeated |  |
| peer_clock | [int64](#int64) |  |  |
| next_available | [bool](#bool) |  |  |






<a name="dialog.ResponseGetUpdatedMessages.UpdatedMessage"></a>

### ResponseGetUpdatedMessages.UpdatedMessage



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mid | [UUIDValue](#dialog.UUIDValue) |  |  |
| message | [MessageContent](#dialog.MessageContent) |  |  |
| modified_at | [int64](#int64) |  |  |






<a name="dialog.ResponseHistoryDifference"></a>

### ResponseHistoryDifference



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| history | [HistoryMessage](#dialog.HistoryMessage) | repeated |  |
| from_clock | [int64](#int64) |  |  |
| clock | [int64](#int64) |  |  |






<a name="dialog.ResponseLoadArchived"></a>

### ResponseLoadArchived
deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| dialogs | [Dialog](#dialog.Dialog) | repeated |  |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| group_peers | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |
| next_offset | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |






<a name="dialog.ResponseLoadDialogs"></a>

### ResponseLoadDialogs
Contains dialogs and related peers and entities


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| dialogs | [Dialog](#dialog.Dialog) | repeated |  |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| group_peers | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |






<a name="dialog.ResponseLoadGroupedDialogs"></a>

### ResponseLoadGroupedDialogs
deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| dialogs | [DialogGroup](#dialog.DialogGroup) | repeated |  |
| show_archived | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| show_invite | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| group_peers | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |






<a name="dialog.ResponseLoadHistory"></a>

### ResponseLoadHistory



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| history | [HistoryMessage](#dialog.HistoryMessage) | repeated |  |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| group_peers | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |
| counter | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | counter of unread messages |
| counter_date | [int64](#int64) |  | date, related to this unread counter |
| last_conversation_message_date | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | last conversation message date |
| count_foreign_after_last_returned | [int32](#int32) |  | counter of the messages between last conversation message (including it) and last returned in this response |






<a name="dialog.ResponseLoadHistoryLight"></a>

### ResponseLoadHistoryLight



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| history | [HistoryMessageLight](#dialog.HistoryMessageLight) | repeated |  |






<a name="dialog.ResponseMessageReads"></a>

### ResponseMessageReads
Response with the list of message statuses reads


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [MessageStatus](#dialog.MessageStatus) | repeated |  |
| timestamp_till | [int64](#int64) |  | max time of returned entries, or requested time if empty |






<a name="dialog.ResponseMessageReceives"></a>

### ResponseMessageReceives
Response with the list of message statuses receives


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [MessageStatus](#dialog.MessageStatus) | repeated |  |
| timestamp_till | [int64](#int64) |  | max time of returned entries, or requested time if empty |






<a name="dialog.ResponseReactionsResponse"></a>

### ResponseReactionsResponse
Response for reactions change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  | deprecated |
| state | [bytes](#bytes) |  |  |
| reactions | [MessageReaction](#dialog.MessageReaction) | repeated |  |






<a name="dialog.ResponseSendMessage"></a>

### ResponseSendMessage



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message_id | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| message_date | [int64](#int64) |  | Message creation date from server |
| previous_message_id | [UUIDValue](#dialog.UUIDValue) |  | Previous message id |
| creator_user_id | [int64](#int64) |  | Message creator |
| clock | [int64](#int64) |  | Clock of this message (initially equals the message_date field) |






<a name="dialog.SearchPredicate"></a>

### SearchPredicate
Predicate for searching in custom profile


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| values | [string](#string) | repeated |  |






<a name="dialog.ServiceEx"></a>

### ServiceEx



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| userInvited | [ServiceExUserInvited](#dialog.ServiceExUserInvited) |  |  |
| userJoined | [ServiceExUserJoined](#dialog.ServiceExUserJoined) |  |  |
| userKicked | [ServiceExUserKicked](#dialog.ServiceExUserKicked) |  |  |
| userLeft | [ServiceExUserLeft](#dialog.ServiceExUserLeft) |  |  |
| groupCreated | [ServiceExGroupCreated](#dialog.ServiceExGroupCreated) |  |  |
| changedShortname | [ServiceExChangedShortname](#dialog.ServiceExChangedShortname) |  |  |
| changedTitle | [ServiceExChangedTitle](#dialog.ServiceExChangedTitle) |  |  |
| changedTopic | [ServiceExChangedTopic](#dialog.ServiceExChangedTopic) |  |  |
| changedAbout | [ServiceExChangedAbout](#dialog.ServiceExChangedAbout) |  |  |
| changedAvatar | [ServiceExChangedAvatar](#dialog.ServiceExChangedAvatar) |  |  |
| contactRegistered | [ServiceExContactRegistered](#dialog.ServiceExContactRegistered) |  |  |
| phoneMissed | [ServiceExPhoneMissed](#dialog.ServiceExPhoneMissed) |  |  |
| phoneCall | [ServiceExPhoneCall](#dialog.ServiceExPhoneCall) |  |  |
| phoneRejected | [ServiceExPhoneRejected](#dialog.ServiceExPhoneRejected) |  |  |
| chatArchived | [ServiceExChatArchived](#dialog.ServiceExChatArchived) |  |  |
| chatRestored | [ServiceExChatRestored](#dialog.ServiceExChatRestored) |  |  |






<a name="dialog.ServiceExChangedAbout"></a>

### ServiceExChangedAbout
Service message on group about change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | New group about |






<a name="dialog.ServiceExChangedAvatar"></a>

### ServiceExChangedAvatar
Service message about avatar change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| avatar | [Avatar](#dialog.Avatar) |  | Updated avatar |






<a name="dialog.ServiceExChangedShortname"></a>

### ServiceExChangedShortname
Service message about group shortname change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| shortname | [string](#string) |  | New group shortname |






<a name="dialog.ServiceExChangedTitle"></a>

### ServiceExChangedTitle
Service message about group title change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| title | [string](#string) |  | New group title |






<a name="dialog.ServiceExChangedTopic"></a>

### ServiceExChangedTopic
Service message on group topic change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| topic | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | New group topic |






<a name="dialog.ServiceExChatArchived"></a>

### ServiceExChatArchived
Message about chat archived






<a name="dialog.ServiceExChatRestored"></a>

### ServiceExChatRestored
Message about chat restored






<a name="dialog.ServiceExContactRegistered"></a>

### ServiceExContactRegistered
Service message about user registration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  | User Id |






<a name="dialog.ServiceExGroupCreated"></a>

### ServiceExGroupCreated
Service message about group creating






<a name="dialog.ServiceExPhoneCall"></a>

### ServiceExPhoneCall
Update about phone call


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| duration | [int32](#int32) |  | Duration of a phone call |






<a name="dialog.ServiceExPhoneMissed"></a>

### ServiceExPhoneMissed
Update about missing phone call






<a name="dialog.ServiceExPhoneRejected"></a>

### ServiceExPhoneRejected
Update about phone call rejected






<a name="dialog.ServiceExUserInvited"></a>

### ServiceExUserInvited
Service message about adding user to group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| invited_uid | [int32](#int32) |  | added user id |






<a name="dialog.ServiceExUserJoined"></a>

### ServiceExUserJoined
Service message about user join to group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| joined_user_id | [int32](#int32) |  |  |






<a name="dialog.ServiceExUserKicked"></a>

### ServiceExUserKicked
Service message about kicking user from group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| kicked_uid | [int32](#int32) |  |  |






<a name="dialog.ServiceExUserLeft"></a>

### ServiceExUserLeft
Service message about user left group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| left_user_id | [int32](#int32) |  |  |






<a name="dialog.ServiceMessage"></a>

### ServiceMessage
Service message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| text | [string](#string) |  |  |
| ext | [ServiceEx](#dialog.ServiceEx) |  |  |






<a name="dialog.StickerMessage"></a>

### StickerMessage
Sticker message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sticker_id | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | Optional Unique ID of sticker |
| fast_preview | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | Optional Fast preview of sticker in webp format |
| image_512 | [ImageLocation](#dialog.ImageLocation) |  | Optional 512x512 sticker image in webp format |
| image_256 | [ImageLocation](#dialog.ImageLocation) |  | Optional 256x256 sticker image in webp format |
| sticker_collection_id | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | Optional Collection ID |
| sticker_collection_access_hash | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | Optional Collection Access Hash |
| emoji | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Sticker emoji |
| animatedStickerJson | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Animated sticker json payload |






<a name="dialog.TextCommand"></a>

### TextCommand
Text Command Message for bots


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| command | [string](#string) |  | Slash-Command For execution |
| args | [string](#string) |  |  |






<a name="dialog.TextExMarkdown"></a>

### TextExMarkdown
Markdown extension


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| markdown | [string](#string) |  | Markdown text |






<a name="dialog.TextMessage"></a>

### TextMessage
Text message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| text | [string](#string) |  |  |
| obsolete_mentions | [int32](#int32) | repeated | Field is deprecated since server 2.6 version. |
| ext | [TextMessageEx](#dialog.TextMessageEx) |  | Optional bytes of extension |
| media | [MessageMedia](#dialog.MessageMedia) | repeated |  |
| extensions | [Any](#dialog.Any) | repeated |  |
| mentions | [Mention](#dialog.Mention) | repeated | Mentions in message |






<a name="dialog.TextMessageEx"></a>

### TextMessageEx



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| textExMarkdown | [TextExMarkdown](#dialog.TextExMarkdown) |  |  |
| textModernMessage | [TextModernMessage](#dialog.TextModernMessage) |  |  |
| textCommand | [TextCommand](#dialog.TextCommand) |  |  |






<a name="dialog.TextModernAttach"></a>

### TextModernAttach
Attaches to message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| title | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| title_url | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| title_icon | [ImageLocation](#dialog.ImageLocation) |  |  |
| text | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| style | [ParagraphStyle](#dialog.ParagraphStyle) |  |  |
| fields | [TextModernField](#dialog.TextModernField) | repeated |  |






<a name="dialog.TextModernField"></a>

### TextModernField
Modern message fields


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| title | [string](#string) |  |  |
| value | [string](#string) |  |  |
| is_short | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Is field can be shown in compact way (default is TRUE) |






<a name="dialog.TextModernMessage"></a>

### TextModernMessage
Modern text message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| text | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| sender_name_override | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| sender_photo_override | [Avatar](#dialog.Avatar) |  |  |
| style | [ParagraphStyle](#dialog.ParagraphStyle) |  |  |
| attaches | [TextModernAttach](#dialog.TextModernAttach) | repeated |  |






<a name="dialog.UnsupportedMessage"></a>

### UnsupportedMessage
Explicit type for unsupported message






<a name="dialog.UpdateChatArchive"></a>

### UpdateChatArchive
Update about chat archive


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |






<a name="dialog.UpdateChatClear"></a>

### UpdateChatClear
Update about chat clear


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| action_date | [int64](#int64) |  |  |






<a name="dialog.UpdateChatDelete"></a>

### UpdateChatDelete
Update about chat delete


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| action_date | [int64](#int64) |  |  |






<a name="dialog.UpdateChatGroupsChanged"></a>

### UpdateChatGroupsChanged
Update about chat groups changed. Called only when adding, removing and reordering of grouped dialog.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| dialogs | [DialogGroup](#dialog.DialogGroup) | repeated |  |






<a name="dialog.UpdateDialogFavouriteChanged"></a>

### UpdateDialogFavouriteChanged
Update about dialog favourite changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| is_favourite | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |






<a name="dialog.UpdateDialogReadLaterChanged"></a>

### UpdateDialogReadLaterChanged
Update about dialog read later changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| read_later | [bool](#bool) |  |  |






<a name="dialog.UpdateInteractiveMediaEvent"></a>

### UpdateInteractiveMediaEvent
The update which will be received when the action is performed. Duplicated on all clients.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id of the message that contains interactive media |
| id | [string](#string) |  | identifier of the media action |
| value | [string](#string) |  | selected value of that action |
| uid | [int32](#int32) |  | who interacted with that media |






<a name="dialog.UpdateMessage"></a>

### UpdateMessage
Update about plain message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| sender_uid | [int32](#int32) |  |  |
| date | [int64](#int64) |  | message creation date (interval end) |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| message | [MessageContent](#dialog.MessageContent) |  |  |
| attributes | [MessageAttributes](#dialog.MessageAttributes) |  | attributes to help reasoning about message |
| forward | [ReferencedMessages](#dialog.ReferencedMessages) |  |  |
| reply | [ReferencedMessages](#dialog.ReferencedMessages) |  |  |
| previous_mid | [UUIDValue](#dialog.UUIDValue) |  | Message id of previos message from current conversation |
| prev_message_date | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | interval start |
| unread_counter_clock | [int64](#int64) |  | counter clock of the unread messages |
| counter | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | counter of the unread messages |
| my_read_date | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | date of my own read |
| random_id | [int64](#int64) |  |  |
| modified_at | [int64](#int64) |  | when greater than date, then message is edited |
| prev_edit_in_peer_at | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | make sense for edited message only (modified_at &gt; date) |






<a name="dialog.UpdateMessageContentChanged"></a>

### UpdateMessageContentChanged
Update about message change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| message | [MessageContent](#dialog.MessageContent) |  |  |
| edited_at | [int64](#int64) |  |  |
| prev_edit_in_peer_at | [int64](#int64) |  |  |
| is_silent | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Update on behalf of a system, should not be displayed as edited. |






<a name="dialog.UpdateMessageDelete"></a>

### UpdateMessageDelete
Update about message delete


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| mids | [UUIDValue](#dialog.UUIDValue) | repeated | Deleted messages |
| counter | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | counter of unread messages |
| action_date | [int64](#int64) |  | date? related for this unread counter |






<a name="dialog.UpdateMessageEditRejectedByHook"></a>

### UpdateMessageEditRejectedByHook
Update about rejection of message update request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | related message id |
| date | [int64](#int64) |  |  |
| hookId | [string](#string) |  |  |
| reason | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.UpdateMessageRead"></a>

### UpdateMessageRead
Update about message read


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| start_date | [int64](#int64) |  | when message was read |
| read_date | [int64](#int64) |  | deprecated |






<a name="dialog.UpdateMessageReadByMe"></a>

### UpdateMessageReadByMe
Update about message read by me


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| start_date | [int64](#int64) |  | date of the read message |
| unread_counter_clock | [int64](#int64) |  | when message was read |
| unread_counter | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | counter of unread messages |






<a name="dialog.UpdateMessageReceived"></a>

### UpdateMessageReceived
Update about message received


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| start_date | [int64](#int64) |  | when message was receive |
| received_date | [int64](#int64) |  | deprecated |






<a name="dialog.UpdateMessageRejectedByHook"></a>

### UpdateMessageRejectedByHook
Update about rejection of message send request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| rid | [int64](#int64) |  |  |
| date | [int64](#int64) |  |  |
| hookId | [string](#string) |  |  |
| reason | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.UpdateMessageSent"></a>

### UpdateMessageSent
Update about message sent


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| rid | [int64](#int64) |  |  |
| date | [int64](#int64) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | Message id |
| prev_mid | [UUIDValue](#dialog.UUIDValue) |  | Previous message id in current conversation |
| unread_counter_clock | [int64](#int64) |  | counter of unread messages |
| unread_counter | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| myReadDate | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |
| forward | [ReferencedMessages](#dialog.ReferencedMessages) |  |  |
| reply | [ReferencedMessages](#dialog.ReferencedMessages) |  |  |






<a name="dialog.UpdatePinnedMessagesChanged"></a>

### UpdatePinnedMessagesChanged
Update about pinned messages changed in conversation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| pinned_messages | [PinnedMessages](#dialog.PinnedMessages) |  |  |
| action_date | [int64](#int64) |  |  |






<a name="dialog.UpdateReactionsUpdate"></a>

### UpdateReactionsUpdate
Update about reactions change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  | related message id |
| reactions | [MessageReaction](#dialog.MessageReaction) | repeated |  |






<a name="dialog.UpdateThreadCreated"></a>

### UpdateThreadCreated
Update about new thread inside group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [GroupOutPeer](#dialog.GroupOutPeer) |  | peer representing thread |
| start_message | [UUIDValue](#dialog.UUIDValue) |  | messageId from parent group where thread starts |






<a name="dialog.UpdateThreadLifted"></a>

### UpdateThreadLifted
Update about thread converted to group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |






<a name="dialog.WebpageMedia"></a>

### WebpageMedia
Webpage media


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| url | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| title | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| description | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| image | [ImageLocation](#dialog.ImageLocation) |  |  |





 


<a name="dialog.DialogsFilter"></a>

### DialogsFilter


| Name | Number | Description |
| ---- | ------ | ----------- |
| DIALOGSFILTER_UNKNOWN | 0 |  |
| DIALOGSFILTER_EXCLUDEFAVOURITES | 1 |  |
| DIALOGSFILTER_EXCLUDEARCHIVED | 2 |  |



<a name="dialog.InteractiveMediaStyle"></a>

### InteractiveMediaStyle


| Name | Number | Description |
| ---- | ------ | ----------- |
| INTERACTIVEMEDIASTYLE_UNKNOWN | 0 |  |
| INTERACTIVEMEDIASTYLE_DEFAULT | 1 |  |
| INTERACTIVEMEDIASTYLE_PRIMARY | 2 |  |
| INTERACTIVEMEDIASTYLE_DANGER | 3 |  |



<a name="dialog.ListLoadMode"></a>

### ListLoadMode


| Name | Number | Description |
| ---- | ------ | ----------- |
| LISTLOADMODE_UNKNOWN | 0 |  |
| LISTLOADMODE_FORWARD | 1 |  |
| LISTLOADMODE_BACKWARD | 2 |  |
| LISTLOADMODE_BOTH | 3 |  |



<a name="dialog.MessageState"></a>

### MessageState


| Name | Number | Description |
| ---- | ------ | ----------- |
| MESSAGESTATE_UNKNOWN | 0 |  |
| MESSAGESTATE_SENT | 1 |  |
| MESSAGESTATE_RECEIVED | 2 |  |
| MESSAGESTATE_READ | 3 |  |


 

 


<a name="dialog.Messaging"></a>

### Messaging


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| DoInteractiveMediaAction | [RequestDoInteractiveMediaAction](#dialog.RequestDoInteractiveMediaAction) | [ResponseVoid](#dialog.ResponseVoid) | Interact with a message media (click on button for example) |
| SendMessage | [RequestSendMessage](#dialog.RequestSendMessage) | [ResponseSendMessage](#dialog.ResponseSendMessage) |  |
| UpdateMessage | [RequestUpdateMessage](#dialog.RequestUpdateMessage) | [ResponseSeqDate](#dialog.ResponseSeqDate) |  |
| MessageReceived | [RequestMessageReceived](#dialog.RequestMessageReceived) | [ResponseVoid](#dialog.ResponseVoid) | Mark message as received by self |
| MessageRead | [RequestMessageRead](#dialog.RequestMessageRead) | [ResponseVoid](#dialog.ResponseVoid) | Mark message as read by self |
| DeleteMessageObsolete | [RequestDeleteMessageObsolete](#dialog.RequestDeleteMessageObsolete) | [ResponseSeq](#dialog.ResponseSeq) | deprecated |
| DeleteMessage | [RequestDeleteMessage](#dialog.RequestDeleteMessage) | [ResponseVoid](#dialog.ResponseVoid) |  |
| ClearChat | [RequestClearChat](#dialog.RequestClearChat) | [ResponseSeq](#dialog.ResponseSeq) | Clear chat history |
| DeleteChat | [RequestDeleteChat](#dialog.RequestDeleteChat) | [ResponseSeq](#dialog.ResponseSeq) |  |
| ArchiveChat | [RequestArchiveChat](#dialog.RequestArchiveChat) | [ResponseSeq](#dialog.ResponseSeq) | deprecated |
| MessageSetReaction | [RequestMessageSetReaction](#dialog.RequestMessageSetReaction) | [ResponseReactionsResponse](#dialog.ResponseReactionsResponse) | Add reaction on message (emoji) |
| MessageRemoveReaction | [RequestMessageRemoveReaction](#dialog.RequestMessageRemoveReaction) | [ResponseReactionsResponse](#dialog.ResponseReactionsResponse) |  |
| LoadHistory | [RequestLoadHistory](#dialog.RequestLoadHistory) | [ResponseLoadHistory](#dialog.ResponseLoadHistory) | Load conversation history |
| LoadHistoryLight | [RequestLoadHistoryLight](#dialog.RequestLoadHistoryLight) | [ResponseLoadHistoryLight](#dialog.ResponseLoadHistoryLight) | Load conversation history |
| CountForeignMessages | [RequestCountForeignMessages](#dialog.RequestCountForeignMessages) | [ResponseCountForeignMessages](#dialog.ResponseCountForeignMessages) |  |
| HistoryDifference | [RequestHistoryDifference](#dialog.RequestHistoryDifference) | [ResponseHistoryDifference](#dialog.ResponseHistoryDifference) | Load total history difference for all user&#39;s conversations |
| LoadDialogs | [RequestLoadDialogs](#dialog.RequestLoadDialogs) | [ResponseLoadDialogs](#dialog.ResponseLoadDialogs) | Load user&#39;s dialogs |
| FetchDialogIndex | [RequestFetchDialogIndex](#dialog.RequestFetchDialogIndex) | [ResponseFetchDialogIndex](#dialog.ResponseFetchDialogIndex) | Load short info about all user&#39;s dialogs |
| DialogListDifference | [RequestDialogListDifference](#dialog.RequestDialogListDifference) | [ResponseDialogListDifference](#dialog.ResponseDialogListDifference) | Load dialogs by peers |
| GetLastConversationMessages | [RequestGetLastConversationMessages](#dialog.RequestGetLastConversationMessages) | [ResponseGetLastConversationMessages](#dialog.ResponseGetLastConversationMessages) | Load last messages of the given conversations |
| LoadArchived | [RequestLoadArchived](#dialog.RequestLoadArchived) | [ResponseLoadArchived](#dialog.ResponseLoadArchived) | deprecated |
| LoadGroupedDialogs | [RequestLoadGroupedDialogs](#dialog.RequestLoadGroupedDialogs) | [ResponseLoadGroupedDialogs](#dialog.ResponseLoadGroupedDialogs) | deprecated |
| HideDialog | [RequestHideDialog](#dialog.RequestHideDialog) | [ResponseDialogsOrder](#dialog.ResponseDialogsOrder) | deprecated |
| ShowDialog | [RequestShowDialog](#dialog.RequestShowDialog) | [ResponseDialogsOrder](#dialog.ResponseDialogsOrder) | deprecated |
| FavouriteDialog | [RequestFavouriteDialog](#dialog.RequestFavouriteDialog) | [ResponseDialogsOrder](#dialog.ResponseDialogsOrder) |  |
| UnfavouriteDialog | [RequestUnfavouriteDialog](#dialog.RequestUnfavouriteDialog) | [ResponseDialogsOrder](#dialog.ResponseDialogsOrder) |  |
| NotifyDialogOpened | [RequestNotifyDialogOpened](#dialog.RequestNotifyDialogOpened) | [ResponseVoid](#dialog.ResponseVoid) |  |
| PinMessage | [RequestPinMessage](#dialog.RequestPinMessage) | [ResponseSeqDate](#dialog.ResponseSeqDate) |  |
| UnpinMessage | [RequestUnpinMessage](#dialog.RequestUnpinMessage) | [ResponseSeqDate](#dialog.ResponseSeqDate) |  |
| GetUpdatedMessages | [RequestGetUpdatedMessages](#dialog.RequestGetUpdatedMessages) | [ResponseGetUpdatedMessages](#dialog.ResponseGetUpdatedMessages) |  |
| GetMessageReads | [RequestMessageReads](#dialog.RequestMessageReads) | [ResponseMessageReads](#dialog.ResponseMessageReads) | Returns read status of the message per user |
| GetMessageReceives | [RequestMessageReceives](#dialog.RequestMessageReceives) | [ResponseMessageReceives](#dialog.ResponseMessageReceives) | Returns receive status of the message per user |
| ReadDialogLater | [RequestReadDialogLater](#dialog.RequestReadDialogLater) | [ResponseVoid](#dialog.ResponseVoid) |  |

 



<a name="miniappsregistry.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## miniappsregistry.proto



<a name="dialog.AccessTokenResponse"></a>

### AccessTokenResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| access_token | [string](#string) |  |  |






<a name="dialog.ExtensionPoint"></a>

### ExtensionPoint



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| app_id | [UUIDValue](#dialog.UUIDValue) |  |  |
| action | [string](#string) |  |  |
| label | [string](#string) |  |  |
| message_conditions | [MessageConditions](#dialog.MessageConditions) |  |  |
| group_conditions | [GroupConditions](#dialog.GroupConditions) |  |  |






<a name="dialog.FindAppRequest"></a>

### FindAppRequest
Findig mini-app by id


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| app_id | [string](#string) |  |  |






<a name="dialog.FindAppResponse"></a>

### FindAppResponse
App found by id (or empty)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| app | [MiniApp](#dialog.MiniApp) |  |  |






<a name="dialog.GetAppsRequest"></a>

### GetAppsRequest
Request to get list of mini-apps


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| from_clock | [int64](#int64) |  | return only apps created/modified since given clock |






<a name="dialog.GetAppsResponse"></a>

### GetAppsResponse
List of the mini-app


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| apps | [MiniApp](#dialog.MiniApp) | repeated |  |
| clock | [int64](#int64) |  |  |






<a name="dialog.GetExtensionsResponse"></a>

### GetExtensionsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message_extensions | [ExtensionPoint](#dialog.ExtensionPoint) | repeated |  |
| chat_extensions | [ExtensionPoint](#dialog.ExtensionPoint) | repeated |  |






<a name="dialog.GroupConditions"></a>

### GroupConditions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_condition | [GroupConditions.GroupCondition](#dialog.GroupConditions.GroupCondition) | repeated |  |






<a name="dialog.GroupConditions.GroupCondition"></a>

### GroupConditions.GroupCondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_type | [string](#string) |  |  |
| visibility | [string](#string) |  |  |
| permission | [string](#string) | repeated |  |






<a name="dialog.IssueAccessTokenRequest"></a>

### IssueAccessTokenRequest
Issue JWT token for third-party applications


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| app_id | [UUIDValue](#dialog.UUIDValue) |  |  |






<a name="dialog.MessageConditions"></a>

### MessageConditions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message_condition | [MessageConditions.MessageCondition](#dialog.MessageConditions.MessageCondition) | repeated |  |






<a name="dialog.MessageConditions.MessageCondition"></a>

### MessageConditions.MessageCondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| text_message | [string](#string) |  |  |
| document_message | [MessageConditions.MessageCondition.DocumentCondition](#dialog.MessageConditions.MessageCondition.DocumentCondition) |  |  |






<a name="dialog.MessageConditions.MessageCondition.DocumentCondition"></a>

### MessageConditions.MessageCondition.DocumentCondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| is_image | [bool](#bool) |  |  |
| is_video | [bool](#bool) |  |  |
| is_audio | [bool](#bool) |  |  |
| mime_type | [string](#string) | repeated |  |






<a name="dialog.MiniApp"></a>

### MiniApp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  | unique identifier of the app |
| app_type | [AppType](#dialog.AppType) |  | type of the app |
| name | [string](#string) |  | name of the app |
| description | [string](#string) |  | additional info, describing this app |
| version | [string](#string) |  | version of app |
| icon | [string](#string) |  | icon name for this app |
| link | [string](#string) |  | link to this app |
| modified_at_ts | [int64](#int64) |  | update date/time in millis |
| is_enabled | [bool](#bool) |  | specifies if this app enabled and user can use it, ot not |
| locales | [MiniApp.LocalesEntry](#dialog.MiniApp.LocalesEntry) | repeated | supported locales |
| permissions | [string](#string) | repeated | application-level permissions |






<a name="dialog.MiniApp.LocalesEntry"></a>

### MiniApp.LocalesEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="dialog.UpdateMiniApp"></a>

### UpdateMiniApp
App update


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| app_lifecycle | [UpdateMiniApp.AppLifecycle](#dialog.UpdateMiniApp.AppLifecycle) |  |  |
| app_data | [MiniApp](#dialog.MiniApp) |  |  |
| prev_clock | [int64](#int64) |  |  |





 


<a name="dialog.AppType"></a>

### AppType
Defines the type of the app. Currently only WebView supported, but more types can be added in future.

| Name | Number | Description |
| ---- | ------ | ----------- |
| UNKNOWN | 0 |  |
| WEB_VIEW | 1 | Url which can be opened inside WebView in dialog app |



<a name="dialog.UpdateMiniApp.AppLifecycle"></a>

### UpdateMiniApp.AppLifecycle


| Name | Number | Description |
| ---- | ------ | ----------- |
| APPLIFECYCLE_CREATED | 0 |  |
| APPLIFECYCLE_UPDATED | 1 |  |
| APPLIFECYCLE_ENABLED | 2 |  |
| APPLIFECYCLE_DISABLED | 3 |  |
| APPLIFECYCLE_DELETED | 4 |  |


 

 


<a name="dialog.ClientsMiniAppsRegistry"></a>

### ClientsMiniAppsRegistry


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| FindApp | [FindAppRequest](#dialog.FindAppRequest) | [FindAppResponse](#dialog.FindAppResponse) |  |
| GetApps | [GetAppsRequest](#dialog.GetAppsRequest) | [GetAppsResponse](#dialog.GetAppsResponse) |  |
| GetExtensions | [.google.protobuf.Empty](#google.protobuf.Empty) | [GetExtensionsResponse](#dialog.GetExtensionsResponse) |  |
| IssueAccessToken | [IssueAccessTokenRequest](#dialog.IssueAccessTokenRequest) | [AccessTokenResponse](#dialog.AccessTokenResponse) |  |

 



<a name="miscellaneous.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## miscellaneous.proto



<a name="dialog.Any"></a>

### Any
Any
typeUrl type url
data data


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type_url | [string](#string) |  |  |
| data | [bytes](#bytes) |  |  |






<a name="dialog.CallsConfig"></a>

### CallsConfig
Calls configuration
callsEnabled If true then client should enable calls
videoCallsEnabled If true then client should enable video calls
groupCallsEnabled If true then client should enable group calls
groupCallsMaxMembers Determines how many members may participate in call
rtcpMuxPolicy The RTCP mux policy to use when gathering ICE candidates
emojiSecurityEnabled If true then client should send and render emoji security
screenSharingEnabled If true then client should enable screen sharing


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| calls_enabled | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| video_calls_enabled | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| group_calls_enabled | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| group_calls_max_members | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| rtcp_mux_policy | [RtcpMuxPolicy](#dialog.RtcpMuxPolicy) |  |  |
| emoji_security_enabled | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| screen_sharing_enabled | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |






<a name="dialog.Config"></a>

### Config
Configuration of system
maxGroupSize Current maximum group size
discover Discover configuration
shareEndpoint Share endpoint
callsConfig Calls configuration
groupInviteConfig Group invite configuration
serverMetaInfo Server meta information (version, etc.)
customProfileSchema Custom profile JSON Schema
servicePeers Service peers supported interpreted by the client


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| max_group_size | [int32](#int32) |  |  |
| discover | [Discover](#dialog.Discover) |  |  |
| share_endpoint | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| calls_config | [CallsConfig](#dialog.CallsConfig) |  |  |
| group_invite_config | [InvitesConfig](#dialog.InvitesConfig) |  |  |
| server_meta_info | [ServerMetaInfo](#dialog.ServerMetaInfo) |  |  |
| custom_profile_schema | [string](#string) |  |  |
| service_peers | [ServicePeers](#dialog.ServicePeers) |  |  |
| extensions | [Any](#dialog.Any) | repeated |  |
| client_keep_alive | [int64](#int64) |  |  |
| supported_methods | [SupportedServerMethodsType](#dialog.SupportedServerMethodsType) | repeated |  |
| max_channel_size | [int32](#int32) |  |  |






<a name="dialog.Discover"></a>

### Discover
Discover description
peers peers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peers | [OutPeer](#dialog.OutPeer) | repeated |  |






<a name="dialog.Extension"></a>

### Extension
Extention
id Extension id
data Extension data


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  |  |
| data | [bytes](#bytes) |  |  |






<a name="dialog.InvitesConfig"></a>

### InvitesConfig
Group invites configuration
baseUrl Base URL part
groupInviteUrlPrefix Prefix for private group invite detection
resolveUrlPrefix Prefix for public groups and users link detection
shareInviteUrl Independent URL for external app sharing


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| base_url | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| group_invite_url_prefix | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| resolve_url_prefix | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| share_invite_url | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.RecursiveMapValue"></a>

### RecursiveMapValue



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| items | [RecursiveMapValue.Item](#dialog.RecursiveMapValue.Item) | repeated |  |






<a name="dialog.RecursiveMapValue.Array"></a>

### RecursiveMapValue.Array



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| values | [RecursiveMapValue.Value](#dialog.RecursiveMapValue.Value) | repeated |  |






<a name="dialog.RecursiveMapValue.Item"></a>

### RecursiveMapValue.Item



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [RecursiveMapValue.Value](#dialog.RecursiveMapValue.Value) |  |  |






<a name="dialog.RecursiveMapValue.Value"></a>

### RecursiveMapValue.Value



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| d | [google.protobuf.DoubleValue](#google.protobuf.DoubleValue) |  |  |
| i32 | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| i64 | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |
| str | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| rec | [RecursiveMapValue](#dialog.RecursiveMapValue) |  |  |
| array_rec | [RecursiveMapValue.Array](#dialog.RecursiveMapValue.Array) |  |  |






<a name="dialog.ResponseBool"></a>

### ResponseBool
Boolean response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [bool](#bool) |  |  |






<a name="dialog.ResponseSeq"></a>

### ResponseSeq
Sequence response. Methods that return this value must process response in particular order


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |
| date | [int64](#int64) |  |  |






<a name="dialog.ResponseSeqDate"></a>

### ResponseSeqDate
Sequence response with date. Methods that return this value must process response in particular order


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |
| date | [int64](#int64) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  |  |






<a name="dialog.ResponseSeqDateMid"></a>

### ResponseSeqDateMid
Response with seq, date and messageId


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |
| date | [int64](#int64) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  |  |






<a name="dialog.ResponseVoid"></a>

### ResponseVoid
Empty response






<a name="dialog.ServerMetaInfo"></a>

### ServerMetaInfo
Some info about the servr
releaseDate Server release date in milliseconds
apiVersion Server api version


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| release_date | [int64](#int64) |  |  |
| api_version | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |






<a name="dialog.ServicePeers"></a>

### ServicePeers
Service peers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| security | [OutPeer](#dialog.OutPeer) |  |  |
| support | [OutPeer](#dialog.OutPeer) |  |  |
| stash | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.UpdateConfig"></a>

### UpdateConfig
Update about config change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [Config](#dialog.Config) |  |  |
| config_hash | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |





 


<a name="dialog.RtcpMuxPolicy"></a>

### RtcpMuxPolicy


| Name | Number | Description |
| ---- | ------ | ----------- |
| RTCPMUXPOLICY_UNKNOWN | 0 |  |
| RTCPMUXPOLICY_NEGOTIATE | 1 |  |
| RTCPMUXPOLICY_REQUIRE | 2 |  |



<a name="dialog.SupportedServerMethodsType"></a>

### SupportedServerMethodsType


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_SUPPORTED_METHODS | 0 |  |
| CHANGE_PASSWORD | 1 |  |



<a name="dialog.UpdateOptimization"></a>

### UpdateOptimization


| Name | Number | Description |
| ---- | ------ | ----------- |
| UPDATEOPTIMIZATION_UNKNOWN | 0 |  |
| UPDATEOPTIMIZATION_STRIP_ENTITIES | 2 | For old bot sdk compatibility |


 

 

 



<a name="obsolete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## obsolete.proto



<a name="dialog.ObsoleteGetDifferenceCommand"></a>

### ObsoleteGetDifferenceCommand



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| state | [bytes](#bytes) |  |  |
| configHash | [int64](#int64) |  |  |






<a name="dialog.ObsoleteOutPeer"></a>

### ObsoleteOutPeer



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [ObsoletePeer](#dialog.ObsoletePeer) |  |  |
| accessHash | [int64](#int64) |  |  |






<a name="dialog.ObsoletePeer"></a>

### ObsoletePeer



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [ObsoletePeer.ObsoletePeerType](#dialog.ObsoletePeer.ObsoletePeerType) |  |  |
| id | [int32](#int32) |  |  |
| strId | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| access_hash | [int64](#int64) |  |  |






<a name="dialog.ObsoletePeersList"></a>

### ObsoletePeersList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peers | [ObsoletePeer](#dialog.ObsoletePeer) | repeated |  |






<a name="dialog.ObsoleteSeqUpdateBox"></a>

### ObsoleteSeqUpdateBox



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |
| obsoleteUpdate | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |






<a name="dialog.ObsoleteServiceUpdate"></a>

### ObsoleteServiceUpdate



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| obsoleteUpdate | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox"></a>

### ObsoleteWeakUpdateBox



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| date | [int64](#int64) |  |  |
| typing | [ObsoleteWeakUpdateBox.ObsoleteUpdateTyping](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateTyping) |  |  |
| userLastSeen | [ObsoleteWeakUpdateBox.ObsoleteUpdateUserLastSeen](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateUserLastSeen) |  |  |
| groupOnline | [ObsoleteWeakUpdateBox.ObsoleteUpdateGroupOnline](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateGroupOnline) |  |  |
| busMessage | [ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusMessage](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusMessage) |  |  |
| busDeviceConnected | [ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceConnected](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceConnected) |  |  |
| busDeviceDisconnected | [ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceDisconnected](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceDisconnected) |  |  |
| busDisposed | [ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDisposed](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDisposed) |  |  |
| forceReload | [ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState) |  |  |
| incomingCall | [ObsoleteWeakUpdateBox.ObsoleteUpdateIncomingCall](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateIncomingCall) |  |  |
| callHandled | [ObsoleteWeakUpdateBox.ObsoleteUpdateCallHandled](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateCallHandled) |  |  |
| callDisposed | [ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed) |  |  |
| update_any | [UpdateSeqUpdate](#dialog.UpdateSeqUpdate) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| callId | [int64](#int64) |  |  |
| attemptIndex | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| reason | [ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed.ObsoleteDisposalReason](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed.ObsoleteDisposalReason) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateCallHandled"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateCallHandled



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| callId | [int64](#int64) |  |  |
| attemptIndex | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceConnected"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceConnected



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| busId | [string](#string) |  |  |
| userId | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| deviceId | [int64](#int64) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceDisconnected"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDeviceDisconnected



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| busId | [string](#string) |  |  |
| userId | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| deviceId | [int64](#int64) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDisposed"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusDisposed



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| busId | [string](#string) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusMessage"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateEventBusMessage



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| busId | [string](#string) |  |  |
| senderId | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| senderDeviceId | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |
| message | [bytes](#bytes) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fields | [ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState.ObsoleteForceReloadField](#dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState.ObsoleteForceReloadField) | repeated |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState.ObsoleteForceReloadField"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateForceReloadState.ObsoleteForceReloadField



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| reloadDialogs | [google.protobuf.Empty](#google.protobuf.Empty) |  |  |
| reloadContacts | [google.protobuf.Empty](#google.protobuf.Empty) |  |  |
| reloadHistory | [ObsoletePeersList](#dialog.ObsoletePeersList) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateGroupOnline"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateGroupOnline



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| groupId | [int32](#int32) |  |  |
| count | [int32](#int32) |  |  |
| clock | [int64](#int64) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateIncomingCall"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateIncomingCall



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| callId | [int64](#int64) |  |  |
| busId | [string](#string) |  |  |
| peer | [ObsoletePeer](#dialog.ObsoletePeer) |  |  |
| displayName | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| attemptIndex | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| outPeer | [ObsoleteOutPeer](#dialog.ObsoleteOutPeer) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateTyping"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateTyping



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [ObsoletePeer](#dialog.ObsoletePeer) |  |  |
| userId | [int32](#int32) |  |  |
| type | [ObsoleteTypingType](#dialog.ObsoleteTypingType) |  |  |
| isTyping | [bool](#bool) |  |  |






<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateUserLastSeen"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateUserLastSeen



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| userId | [int32](#int32) |  |  |
| epochMillis | [int64](#int64) |  |  |
| deviceType | [int32](#int32) |  |  |
| deviceCategory | [string](#string) |  |  |
| isOnline | [bool](#bool) |  |  |






<a name="dialog.ObsoleteWeakUpdateCommand"></a>

### ObsoleteWeakUpdateCommand



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subscribeToOnlines | [ObsoletePeersList](#dialog.ObsoletePeersList) |  |  |
| unsubscribeFromOnlines | [ObsoletePeersList](#dialog.ObsoletePeersList) |  |  |
| dropOnlineSubscriptions | [google.protobuf.Empty](#google.protobuf.Empty) |  |  |
| myTyping | [ObsoleteWeakUpdateCommand.ObsoleteMyTyping](#dialog.ObsoleteWeakUpdateCommand.ObsoleteMyTyping) |  |  |
| subscribeToTypings | [ObsoletePeersList](#dialog.ObsoletePeersList) |  |  |
| unsubscribeFromTypings | [ObsoletePeersList](#dialog.ObsoletePeersList) |  |  |
| dropTypingSubscriptions | [google.protobuf.Empty](#google.protobuf.Empty) |  |  |
| subscribeToEventBusUpdates | [google.protobuf.Empty](#google.protobuf.Empty) |  |  |
| myOnline | [ObsoleteWeakUpdateCommand.ObsoleteMyOnline](#dialog.ObsoleteWeakUpdateCommand.ObsoleteMyOnline) |  |  |






<a name="dialog.ObsoleteWeakUpdateCommand.ObsoleteMyOnline"></a>

### ObsoleteWeakUpdateCommand.ObsoleteMyOnline



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| online | [bool](#bool) |  |  |






<a name="dialog.ObsoleteWeakUpdateCommand.ObsoleteMyTyping"></a>

### ObsoleteWeakUpdateCommand.ObsoleteMyTyping



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [ObsoletePeer](#dialog.ObsoletePeer) |  |  |
| type | [ObsoleteTypingType](#dialog.ObsoleteTypingType) |  |  |
| start | [bool](#bool) |  |  |





 


<a name="dialog.ObsoletePeer.ObsoletePeerType"></a>

### ObsoletePeer.ObsoletePeerType


| Name | Number | Description |
| ---- | ------ | ----------- |
| OBSOLETE_PEERTYPE_UNKNOWN | 0 |  |
| OBSOLETE_PEERTYPE_PRIVATE | 1 |  |
| OBSOLETE_PEERTYPE_GROUP | 2 |  |
| OBSOLETE_PEERTYPE_SIP | 4 | PEERTYPE_ENCRYPTED_PRIVATE = 3; |



<a name="dialog.ObsoleteTypingType"></a>

### ObsoleteTypingType


| Name | Number | Description |
| ---- | ------ | ----------- |
| OBSOLETE_TYPINGTYPE_UNKNOWN | 0 |  |
| OBSOLETE_TYPINGTYPE_TEXT | 1 |  |



<a name="dialog.ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed.ObsoleteDisposalReason"></a>

### ObsoleteWeakUpdateBox.ObsoleteUpdateCallDisposed.ObsoleteDisposalReason


| Name | Number | Description |
| ---- | ------ | ----------- |
| OBSOLETE_DISPOSAL_REASON_UNKNOWN | 0 |  |
| OBSOLETE_DISPOSAL_REASON_REJECTED | 1 |  |
| OBSOLETE_DISPOSAL_REASON_BUSY | 2 |  |
| OBSOLETE_DISPOSAL_REASON_ENDED | 3 |  |
| OBSOLETE_DISPOSAL_REASON_ANSWER_TIMEOUT | 4 |  |


 

 


<a name="dialog.Obsolete"></a>

### Obsolete
deprecated

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Obsolete | [.google.protobuf.BytesValue](#google.protobuf.BytesValue) | [.google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |
| SeqUpdates | [.google.protobuf.Empty](#google.protobuf.Empty) | [ObsoleteSeqUpdateBox](#dialog.ObsoleteSeqUpdateBox) stream |  |
| WeakUpdates | [ObsoleteWeakUpdateCommand](#dialog.ObsoleteWeakUpdateCommand) stream | [ObsoleteWeakUpdateBox](#dialog.ObsoleteWeakUpdateBox) stream |  |

 



<a name="peers.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## peers.proto



<a name="dialog.GroupOutPeer"></a>

### GroupOutPeer
Group&#39;s out peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| access_hash | [int64](#int64) |  |  |






<a name="dialog.OutPeer"></a>

### OutPeer
Out peer with access hash


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [PeerType](#dialog.PeerType) |  |  |
| id | [int32](#int32) |  |  |
| access_hash | [int64](#int64) |  |  |
| str_id | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.Peer"></a>

### Peer
Peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [PeerType](#dialog.PeerType) |  |  |
| id | [int32](#int32) |  |  |
| str_id | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.UserOutPeer"></a>

### UserOutPeer
User&#39;s out peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  | User&#39;s id |
| access_hash | [int64](#int64) |  |  |





 


<a name="dialog.PeerType"></a>

### PeerType


| Name | Number | Description |
| ---- | ------ | ----------- |
| PEERTYPE_UNKNOWN | 0 |  |
| PEERTYPE_PRIVATE | 1 |  |
| PEERTYPE_GROUP | 2 |  |
| PEERTYPE_ENCRYPTEDPRIVATE | 3 |  |
| PEERTYPE_SIP | 4 |  |


 

 

 



<a name="permissions.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## permissions.proto



<a name="dialog.RequestGetPermissions"></a>

### RequestGetPermissions







<a name="dialog.ResponseGetPermissions"></a>

### ResponseGetPermissions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| permissions | [Permission](#dialog.Permission) | repeated |  |
| all_known_permissions | [Permission](#dialog.Permission) | repeated |  |
| clock | [int64](#int64) |  |  |






<a name="dialog.UpdatePermissionsChange"></a>

### UpdatePermissionsChange



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| permissions | [Permission](#dialog.Permission) | repeated |  |
| clock | [int64](#int64) |  |  |





 


<a name="dialog.Permission"></a>

### Permission
Permissions definition

| Name | Number | Description |
| ---- | ------ | ----------- |
| PERMISSION_UNKNOWN | 0 |  |
| PERMISSION_SEARCH | 1 |  |
| PERMISSION_CREATE_GROUPS | 2 |  |
| PERMISSION_LEAVE_GROUPS | 3 |  |


 

 


<a name="dialog.Permissions"></a>

### Permissions


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetPermissions | [RequestGetPermissions](#dialog.RequestGetPermissions) | [ResponseGetPermissions](#dialog.ResponseGetPermissions) |  |

 



<a name="presence.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## presence.proto



<a name="dialog.RequestGetUserLastPresence"></a>

### RequestGetUserLastPresence
Request for last user online timestamp


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_out_peer | [UserOutPeer](#dialog.UserOutPeer) |  |  |






<a name="dialog.RequestSetOnline"></a>

### RequestSetOnline
Sending online state


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| is_online | [bool](#bool) |  |  |
| timeout | [int64](#int64) |  | offline after timeout |
| device_type | [DeviceType](#dialog.DeviceType) |  |  |






<a name="dialog.RequestStartTyping"></a>

### RequestStartTyping
Sending typing notification


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| typing_type | [TypingType](#dialog.TypingType) |  |  |






<a name="dialog.RequestStopTyping"></a>

### RequestStopTyping
Stop typing


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| typing_type | [TypingType](#dialog.TypingType) |  |  |






<a name="dialog.ResponseUserLastPresence"></a>

### ResponseUserLastPresence
Response for RequestGetUserLastPresence


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| last_online_at | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| not_found_error | [ResponseUserLastPresence.UserNotFoundError](#dialog.ResponseUserLastPresence.UserNotFoundError) |  |  |






<a name="dialog.ResponseUserLastPresence.UserNotFoundError"></a>

### ResponseUserLastPresence.UserNotFoundError







<a name="dialog.UpdateGroupOnline"></a>

### UpdateGroupOnline
Update about group online change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| count | [int32](#int32) |  | amount of online users. |
| users_id | [int32](#int32) | repeated | The list of online users will only be sent if the flag was set during the subscription. |






<a name="dialog.UpdateGroupTyping"></a>

### UpdateGroupTyping



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [int32](#int32) |  |  |
| users_typing | [UpdateGroupTyping.UserTyping](#dialog.UpdateGroupTyping.UserTyping) | repeated |  |






<a name="dialog.UpdateGroupTyping.UserTyping"></a>

### UpdateGroupTyping.UserTyping



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_id | [int32](#int32) |  |  |
| typing_type | [TypingType](#dialog.TypingType) |  |  |






<a name="dialog.UpdateTyping"></a>

### UpdateTyping
Update about user&#39;s typing


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| user_id | [int32](#int32) |  |  |
| typing_type | [TypingType](#dialog.TypingType) |  |  |






<a name="dialog.UpdateTypingStop"></a>

### UpdateTypingStop
Update about user&#39;s typing stop


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| user_id | [int32](#int32) |  |  |
| typing_type | [TypingType](#dialog.TypingType) |  |  |






<a name="dialog.UpdateUserLastSeen"></a>

### UpdateUserLastSeen
Update about user&#39;s last seen state


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| last_seen_at | [int64](#int64) |  |  |
| device_type | [DeviceType](#dialog.DeviceType) |  |  |
| current_time | [int64](#int64) |  |  |






<a name="dialog.UpdateUserOffline"></a>

### UpdateUserOffline
Update about user became offline


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| device_type | [DeviceType](#dialog.DeviceType) |  |  |






<a name="dialog.UpdateUserOnline"></a>

### UpdateUserOnline
Update about user became online


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_id | [int32](#int32) |  |  |
| device_type | [DeviceType](#dialog.DeviceType) |  |  |





 


<a name="dialog.DeviceType"></a>

### DeviceType


| Name | Number | Description |
| ---- | ------ | ----------- |
| DEVICETYPE_UNKNOWN | 0 |  |
| DEVICETYPE_GENERIC | 1 |  |
| DEVICETYPE_PC | 2 |  |
| DEVICETYPE_MOBILE | 3 |  |
| DEVICETYPE_TABLET | 4 |  |
| DEVICETYPE_WATCH | 5 |  |
| DEVICETYPE_MIRROR | 6 |  |
| DEVICETYPE_CAR | 7 |  |
| DEVICETYPE_TABLE | 8 |  |



<a name="dialog.TypingType"></a>

### TypingType


| Name | Number | Description |
| ---- | ------ | ----------- |
| TYPINGTYPE_UNKNOWN | 0 |  |
| TYPINGTYPE_TEXT | 1 |  |
| TYPINGTYPE_VOICE | 2 |  |


 

 


<a name="dialog.Presence"></a>

### Presence


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| StartTyping | [RequestStartTyping](#dialog.RequestStartTyping) | [ResponseVoid](#dialog.ResponseVoid) |  |
| StopTyping | [RequestStopTyping](#dialog.RequestStopTyping) | [ResponseVoid](#dialog.ResponseVoid) |  |
| SetOnline | [RequestSetOnline](#dialog.RequestSetOnline) | [ResponseVoid](#dialog.ResponseVoid) |  |
| GetUserLastPresence | [RequestGetUserLastPresence](#dialog.RequestGetUserLastPresence) | [ResponseUserLastPresence](#dialog.ResponseUserLastPresence) |  |

 



<a name="privacy.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## privacy.proto



<a name="dialog.RequestBlockUser"></a>

### RequestBlockUser
Block User


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [UserOutPeer](#dialog.UserOutPeer) |  |  |






<a name="dialog.RequestLoadBlockedUsers"></a>

### RequestLoadBlockedUsers
Load Blocked Users






<a name="dialog.RequestUnblockUser"></a>

### RequestUnblockUser
Unblock User


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [UserOutPeer](#dialog.UserOutPeer) |  |  |






<a name="dialog.ResponseLoadBlockedUsers"></a>

### ResponseLoadBlockedUsers



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |






<a name="dialog.UpdateUserBlocked"></a>

### UpdateUserBlocked
Update about User Blocked


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |






<a name="dialog.UpdateUserUnblocked"></a>

### UpdateUserUnblocked
Update about User Unblocked


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |





 

 

 


<a name="dialog.Privacy"></a>

### Privacy


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| BlockUser | [RequestBlockUser](#dialog.RequestBlockUser) | [ResponseSeq](#dialog.ResponseSeq) |  |
| UnblockUser | [RequestUnblockUser](#dialog.RequestUnblockUser) | [ResponseSeq](#dialog.ResponseSeq) |  |
| LoadBlockedUsers | [RequestLoadBlockedUsers](#dialog.RequestLoadBlockedUsers) | [ResponseLoadBlockedUsers](#dialog.ResponseLoadBlockedUsers) |  |

 



<a name="profile.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## profile.proto



<a name="dialog.RequestChangeUserStatus"></a>

### RequestChangeUserStatus
Changing user&#39;s status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [UserStatus](#dialog.UserStatus) |  |  |






<a name="dialog.RequestCheckNickName"></a>

### RequestCheckNickName
Checking availability of nickname


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nickname | [string](#string) |  |  |






<a name="dialog.RequestEditAbout"></a>

### RequestEditAbout
Changing about information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.RequestEditAvatar"></a>

### RequestEditAvatar
Changing account&#39;s avatar


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| file_location | [FileLocation](#dialog.FileLocation) |  |  |






<a name="dialog.RequestEditCustomProfile"></a>

### RequestEditCustomProfile
Chaning user custom profile based on scheme


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| custom_profile | [string](#string) |  |  |






<a name="dialog.RequestEditMyPreferredLanguages"></a>

### RequestEditMyPreferredLanguages
Changing preffered languages


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| preferred_languages | [string](#string) | repeated |  |






<a name="dialog.RequestEditMyTimeZone"></a>

### RequestEditMyTimeZone
Updating user&#39;s time zone


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tz | [string](#string) |  |  |






<a name="dialog.RequestEditName"></a>

### RequestEditName
Changing account&#39;s name


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="dialog.RequestEditNickName"></a>

### RequestEditNickName
Changing account&#39;s nickname


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nickname | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.RequestEditSex"></a>

### RequestEditSex
Changing user&#39;s sex


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sex | [Sex](#dialog.Sex) |  |  |






<a name="dialog.RequestRemoveAvatar"></a>

### RequestRemoveAvatar
Removing account&#39;s avatar






<a name="dialog.ResponseEditAvatar"></a>

### ResponseEditAvatar



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| avatar | [Avatar](#dialog.Avatar) |  |  |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |





 

 

 


<a name="dialog.Profile"></a>

### Profile


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| EditName | [RequestEditName](#dialog.RequestEditName) | [ResponseSeq](#dialog.ResponseSeq) |  |
| EditNickName | [RequestEditNickName](#dialog.RequestEditNickName) | [ResponseSeq](#dialog.ResponseSeq) |  |
| CheckNickName | [RequestCheckNickName](#dialog.RequestCheckNickName) | [ResponseBool](#dialog.ResponseBool) |  |
| EditAbout | [RequestEditAbout](#dialog.RequestEditAbout) | [ResponseSeq](#dialog.ResponseSeq) |  |
| EditAvatar | [RequestEditAvatar](#dialog.RequestEditAvatar) | [ResponseEditAvatar](#dialog.ResponseEditAvatar) |  |
| RemoveAvatar | [RequestRemoveAvatar](#dialog.RequestRemoveAvatar) | [ResponseSeq](#dialog.ResponseSeq) |  |
| EditMyTimeZone | [RequestEditMyTimeZone](#dialog.RequestEditMyTimeZone) | [ResponseSeq](#dialog.ResponseSeq) |  |
| EditMyPreferredLanguages | [RequestEditMyPreferredLanguages](#dialog.RequestEditMyPreferredLanguages) | [ResponseSeq](#dialog.ResponseSeq) |  |
| EditSex | [RequestEditSex](#dialog.RequestEditSex) | [ResponseSeq](#dialog.ResponseSeq) |  |
| EditCustomProfile | [RequestEditCustomProfile](#dialog.RequestEditCustomProfile) | [ResponseSeq](#dialog.ResponseSeq) |  |
| ChangeUserStatus | [RequestChangeUserStatus](#dialog.RequestChangeUserStatus) | [ResponseSeq](#dialog.ResponseSeq) |  |

 



<a name="push.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## push.proto



<a name="dialog.RequestRegisterApplePush"></a>

### RequestRegisterApplePush
Registering apple push on server


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| apns_key | [int32](#int32) |  |  |
| token | [string](#string) |  |  |
| apns_string_key | [string](#string) |  |  |






<a name="dialog.RequestRegisterApplePushKit"></a>

### RequestRegisterApplePushKit
Registration of a new Apple&#39;s PushKit tokens


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| apns_key | [int32](#int32) |  |  |
| token | [string](#string) |  |  |
| apns_string_key | [string](#string) |  |  |






<a name="dialog.RequestRegisterApplePushToken"></a>

### RequestRegisterApplePushToken
Registering Apple Push Token


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bundle_id | [string](#string) |  |  |
| token | [string](#string) |  |  |






<a name="dialog.RequestRegisterAvroraPushToken"></a>

### RequestRegisterAvroraPushToken
Registering Avrora Push Token


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |






<a name="dialog.RequestRegisterGooglePush"></a>

### RequestRegisterGooglePush
Registering push token on server


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| project_id | [int64](#int64) |  |  |
| token | [string](#string) |  |  |






<a name="dialog.RequestUnregisterApplePush"></a>

### RequestUnregisterApplePush
Unregistering Apple Push


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |






<a name="dialog.RequestUnregisterApplePushKit"></a>

### RequestUnregisterApplePushKit
Unregistering Apple Push Kit token


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |






<a name="dialog.RequestUnregisterApplePushToken"></a>

### RequestUnregisterApplePushToken
Unregister Apple Push token


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |






<a name="dialog.RequestUnregisterAvroraPushToken"></a>

### RequestUnregisterAvroraPushToken
Unregister Avrora Push token


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |






<a name="dialog.RequestUnregisterGooglePush"></a>

### RequestUnregisterGooglePush
Unregistering Google Push


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |





 

 

 


<a name="dialog.Push"></a>

### Push


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| RegisterGooglePush | [RequestRegisterGooglePush](#dialog.RequestRegisterGooglePush) | [ResponseVoid](#dialog.ResponseVoid) |  |
| UnregisterGooglePush | [RequestUnregisterGooglePush](#dialog.RequestUnregisterGooglePush) | [ResponseVoid](#dialog.ResponseVoid) |  |
| RegisterApplePush | [RequestRegisterApplePush](#dialog.RequestRegisterApplePush) | [ResponseVoid](#dialog.ResponseVoid) |  |
| UnregisterApplePush | [RequestUnregisterApplePush](#dialog.RequestUnregisterApplePush) | [ResponseVoid](#dialog.ResponseVoid) |  |
| RegisterApplePushKit | [RequestRegisterApplePushKit](#dialog.RequestRegisterApplePushKit) | [ResponseVoid](#dialog.ResponseVoid) |  |
| UnregisterApplePushKit | [RequestUnregisterApplePushKit](#dialog.RequestUnregisterApplePushKit) | [ResponseVoid](#dialog.ResponseVoid) |  |
| RegisterApplePushToken | [RequestRegisterApplePushToken](#dialog.RequestRegisterApplePushToken) | [ResponseVoid](#dialog.ResponseVoid) |  |
| UnregisterApplePushToken | [RequestUnregisterApplePushToken](#dialog.RequestUnregisterApplePushToken) | [ResponseVoid](#dialog.ResponseVoid) |  |
| RegisterAvroraPushToken | [RequestRegisterAvroraPushToken](#dialog.RequestRegisterAvroraPushToken) | [ResponseVoid](#dialog.ResponseVoid) |  |
| UnregisterAvroraPushToken | [RequestUnregisterAvroraPushToken](#dialog.RequestUnregisterAvroraPushToken) | [ResponseVoid](#dialog.ResponseVoid) |  |

 



<a name="push_content.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## push_content.proto



<a name="dialog.EncryptedPushContent"></a>

### EncryptedPushContent
The structure of encrypted push content


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| loc_alert_body | [LocalizableString](#dialog.LocalizableString) |  |  |
| simple_alert_body | [string](#string) |  |  |
| loc_alert_title | [LocalizableString](#dialog.LocalizableString) |  |  |
| simple_alert_title | [string](#string) |  |  |
| sound | [string](#string) |  |  |
| unread_message_counter | [int32](#int32) |  |  |
| peer | [PushPeer](#dialog.PushPeer) |  |  |
| message_id | [UUIDValue](#dialog.UUIDValue) |  |  |
| isRespondable | [bool](#bool) |  | if true, user can respond to this push |
| sender_user_id | [int32](#int32) |  | if sender is channel so value eq 0 |
| date | [int64](#int64) |  | date of the event (usually message) |
| event_type | [PushEventType](#dialog.PushEventType) |  | type of the event |






<a name="dialog.LocalizableString"></a>

### LocalizableString



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| loc_key | [string](#string) |  |  |
| loc_args | [string](#string) | repeated |  |






<a name="dialog.PushPeer"></a>

### PushPeer



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [PushPeerType](#dialog.PushPeerType) |  |  |
| id | [int32](#int32) |  |  |
| str_id | [string](#string) |  |  |





 


<a name="dialog.PushEventType"></a>

### PushEventType


| Name | Number | Description |
| ---- | ------ | ----------- |
| CREATE | 0 |  |
| UPDATE | 1 |  |
| DELETE | 2 |  |



<a name="dialog.PushPeerType"></a>

### PushPeerType


| Name | Number | Description |
| ---- | ------ | ----------- |
| PUSH_PEER_TYPE_PRIVATE | 0 |  |
| PUSH_PEER_TYPE_GROUP | 1 |  |
| PUSH_PEER_TYPE_SIP | 2 |  |


 

 

 



<a name="raw_api.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## raw_api.proto



<a name="dialog.RequestRawRequest"></a>

### RequestRawRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| service | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| body | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |






<a name="dialog.ResponseRawRequest"></a>

### ResponseRawRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| body | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |





 

 

 


<a name="dialog.RawAPI"></a>

### RawAPI


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| RawRequest | [RequestRawRequest](#dialog.RequestRawRequest) | [ResponseRawRequest](#dialog.ResponseRawRequest) |  |

 



<a name="reactions.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## reactions.proto



<a name="dialog.reactions.GetMessageReactionsRequest"></a>

### GetMessageReactionsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [dialog.Peer](#dialog.Peer) |  |  |
| message_ids | [dialog.UUIDValue](#dialog.UUIDValue) | repeated |  |






<a name="dialog.reactions.GetMessageReactionsResponse"></a>

### GetMessageReactionsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| messageReactions | [MessageReactions](#dialog.reactions.MessageReactions) | repeated |  |






<a name="dialog.reactions.GetReactionsRequest"></a>

### GetReactionsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| from_clock | [int64](#int64) |  |  |
| peer | [dialog.Peer](#dialog.Peer) |  |  |






<a name="dialog.reactions.GetReactionsResponse"></a>

### GetReactionsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| messageReactions | [MessageReactions](#dialog.reactions.MessageReactions) | repeated |  |
| peer_clock | [int64](#int64) |  |  |
| next_available | [bool](#bool) |  |  |






<a name="dialog.reactions.MessageReactions"></a>

### MessageReactions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mid | [dialog.UUIDValue](#dialog.UUIDValue) |  |  |
| reactions | [Reaction](#dialog.reactions.Reaction) | repeated |  |






<a name="dialog.reactions.MessageReactionsUpdate"></a>

### MessageReactionsUpdate



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [dialog.Peer](#dialog.Peer) |  |  |
| messageReaction | [MessageReactions](#dialog.reactions.MessageReactions) |  |  |
| peer_clock | [int64](#int64) |  |  |
| prev_peer_clock | [int64](#int64) |  |  |






<a name="dialog.reactions.Reaction"></a>

### Reaction



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| code | [string](#string) |  |  |
| users | [int32](#int32) | repeated |  |
| users_amount | [int32](#int32) |  |  |






<a name="dialog.reactions.RequestRemoveMessageReaction"></a>

### RequestRemoveMessageReaction



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [dialog.Peer](#dialog.Peer) |  |  |
| mid | [dialog.UUIDValue](#dialog.UUIDValue) |  |  |
| code | [string](#string) |  |  |






<a name="dialog.reactions.RequestSetMessageReaction"></a>

### RequestSetMessageReaction



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [dialog.Peer](#dialog.Peer) |  |  |
| mid | [dialog.UUIDValue](#dialog.UUIDValue) |  |  |
| code | [string](#string) |  |  |





 

 

 


<a name="dialog.reactions.Reactions"></a>

### Reactions


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetReactions | [GetReactionsRequest](#dialog.reactions.GetReactionsRequest) | [GetReactionsResponse](#dialog.reactions.GetReactionsResponse) |  |
| GetMessageReactions | [GetMessageReactionsRequest](#dialog.reactions.GetMessageReactionsRequest) | [GetMessageReactionsResponse](#dialog.reactions.GetMessageReactionsResponse) |  |
| MessageSetReaction | [RequestSetMessageReaction](#dialog.reactions.RequestSetMessageReaction) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| MessageRemoveReaction | [RequestRemoveMessageReaction](#dialog.reactions.RequestRemoveMessageReaction) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |

 



<a name="registration.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## registration.proto



<a name="dialog.RegisterDeprecatedDeviceRequest"></a>

### RegisterDeprecatedDeviceRequest







<a name="dialog.RequestExchangeAuthIdForToken"></a>

### RequestExchangeAuthIdForToken



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth_id | [int64](#int64) |  |  |
| signature | [bytes](#bytes) |  |  |






<a name="dialog.RequestRegisterDevice"></a>

### RequestRegisterDevice



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| client_pk | [bytes](#bytes) |  |  |
| app_id | [int32](#int32) |  |  |
| app_title | [string](#string) |  |  |
| device_title | [string](#string) |  |  |






<a name="dialog.ResponseDeviceRequest"></a>

### ResponseDeviceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| server_pk | [bytes](#bytes) |  |  |
| auth_id | [int64](#int64) |  |  |
| token | [string](#string) |  |  |
| auth_method_seq | [AuthorizationMethod](#dialog.AuthorizationMethod) | repeated | Sequence of the required authorization methods |





 


<a name="dialog.AuthorizationMethod"></a>

### AuthorizationMethod


| Name | Number | Description |
| ---- | ------ | ----------- |
| AUTHORIZATION_METHOD_NOTHING | 0 |  |
| AUTHORIZATION_METHOD_USERNAME | 1 |  |
| AUTHORIZATION_METHOD_PHONE | 2 |  |
| AUTHORIZATION_METHOD_EMAIL | 3 |  |
| AUTHORIZATION_METHOD_CERTIFICATE | 4 |  |
| AUTHORIZATION_METHOD_OAUTH | 5 |  |


 

 


<a name="dialog.Registration"></a>

### Registration


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| ExchangeAuthIdForToken | [RequestExchangeAuthIdForToken](#dialog.RequestExchangeAuthIdForToken) | [ResponseDeviceRequest](#dialog.ResponseDeviceRequest) |  |
| RegisterDevice | [RequestRegisterDevice](#dialog.RequestRegisterDevice) | [ResponseDeviceRequest](#dialog.ResponseDeviceRequest) | register device to get auth token |
| RegisterDeprecatedDevice | [RegisterDeprecatedDeviceRequest](#dialog.RegisterDeprecatedDeviceRequest) | [ResponseDeviceRequest](#dialog.ResponseDeviceRequest) | deprecated |

 



<a name="search.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## search.proto



<a name="dialog.MessageSearchItem"></a>

### MessageSearchItem
Message Search result container


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| result | [MessageSearchResult](#dialog.MessageSearchResult) |  |  |






<a name="dialog.MessageSearchResult"></a>

### MessageSearchResult
Message container


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| rid | [int64](#int64) |  | deprecated |
| date | [int64](#int64) |  |  |
| sender_id | [int32](#int32) |  |  |
| content | [MessageContent](#dialog.MessageContent) |  |  |
| mid | [UUIDValue](#dialog.UUIDValue) |  |  |
| highlight_tokens | [string](#string) | repeated |  |






<a name="dialog.PeerSearchResult"></a>

### PeerSearchResult
Peer search result


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| title | [string](#string) |  |  |
| shortname | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| description | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| members_count | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| date_created | [int64](#int64) |  | Group Creation Date |
| creator | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| is_public | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| is_joined | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Are you joined? |






<a name="dialog.RequestFieldAutocomplete"></a>

### RequestFieldAutocomplete



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| field_name | [string](#string) |  |  |
| field_value | [string](#string) |  |  |






<a name="dialog.RequestGetPromotedPeers"></a>

### RequestGetPromotedPeers







<a name="dialog.RequestGetRecommendations"></a>

### RequestGetRecommendations







<a name="dialog.RequestLoadUserSearchByPredicatesCount"></a>

### RequestLoadUserSearchByPredicatesCount



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| predicates | [SearchPredicate](#dialog.SearchPredicate) | repeated |  |
| group_id | [int32](#int32) |  |  |






<a name="dialog.RequestLoadUserSearchByPredicatesResults"></a>

### RequestLoadUserSearchByPredicatesResults



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| predicates | [SearchPredicate](#dialog.SearchPredicate) | repeated |  |
| group_id | [int32](#int32) |  |  |
| query | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| limit | [int32](#int32) |  |  |
| required_fields | [string](#string) | repeated |  |






<a name="dialog.RequestMessageSearch"></a>

### RequestMessageSearch
Performing message search


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| query | [SearchCondition](#dialog.SearchCondition) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestMessageSearchMore"></a>

### RequestMessageSearchMore
Performing message search paging


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| load_more_state | [bytes](#bytes) |  | Cursor |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestPeerSearch"></a>

### RequestPeerSearch
Performing peer search


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| query | [SearchCondition](#dialog.SearchCondition) | repeated |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestResolvePeer"></a>

### RequestResolvePeer
Resolve peer by shortname


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| shortname | [string](#string) |  |  |






<a name="dialog.RequestSimpleSearch"></a>

### RequestSimpleSearch



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| criteria | [SimpleSearchCondition](#dialog.SimpleSearchCondition) | repeated |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestSimpleSearchMore"></a>

### RequestSimpleSearchMore



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| load_more_state | [bytes](#bytes) |  | Cursor |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.ResponseFieldAutocomplete"></a>

### ResponseFieldAutocomplete



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| field_name | [string](#string) |  |  |
| field_value | [string](#string) | repeated |  |






<a name="dialog.ResponseGetPromotedPeers"></a>

### ResponseGetPromotedPeers



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| group_peers | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |






<a name="dialog.ResponseGetRecommendations"></a>

### ResponseGetRecommendations



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peers | [OutPeer](#dialog.OutPeer) | repeated |  |






<a name="dialog.ResponseLoadUserSearchByPredicatesCount"></a>

### ResponseLoadUserSearchByPredicatesCount



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| result_count | [int32](#int32) |  |  |






<a name="dialog.ResponseLoadUserSearchByPredicatesResults"></a>

### ResponseLoadUserSearchByPredicatesResults



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [UserMatch](#dialog.UserMatch) | repeated |  |
| result_count | [int32](#int32) |  |  |






<a name="dialog.ResponseMessageSearchResponse"></a>

### ResponseMessageSearchResponse
Search Result with related peers and entities


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| search_results | [MessageSearchItem](#dialog.MessageSearchItem) | repeated |  |
| load_more_state | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |
| user_out_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| group_out_peers | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |
| total_count | [int64](#int64) |  |  |






<a name="dialog.ResponsePeerSearch"></a>

### ResponsePeerSearch
Response with related peers and entities


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [User](#dialog.User) | repeated | For old bot sdk compatibility |
| groups | [Group](#dialog.Group) | repeated | ----------------------------- |
| search_results | [PeerSearchResult](#dialog.PeerSearchResult) | repeated |  |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| group_peers | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |






<a name="dialog.ResponseResolvePeer"></a>

### ResponseResolvePeer



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.SearchAndCondition"></a>

### SearchAndCondition
Search AND condion


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| and_query | [SearchCondition](#dialog.SearchCondition) | repeated | &#34;And&#34; query |






<a name="dialog.SearchCondition"></a>

### SearchCondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| searchPeerTypeCondition | [SearchPeerTypeCondition](#dialog.SearchPeerTypeCondition) |  |  |
| searchPieceText | [SearchPieceText](#dialog.SearchPieceText) |  |  |
| searchAndCondition | [SearchAndCondition](#dialog.SearchAndCondition) |  |  |
| searchOrCondition | [SearchOrCondition](#dialog.SearchOrCondition) |  |  |
| searchPeerCondition | [SearchPeerCondition](#dialog.SearchPeerCondition) |  |  |
| searchPeerContentType | [SearchPeerContentType](#dialog.SearchPeerContentType) |  |  |
| searchSenderIdConfition | [SearchSenderIdConfition](#dialog.SearchSenderIdConfition) |  |  |






<a name="dialog.SearchOrCondition"></a>

### SearchOrCondition
Search OR condition


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| or_query | [SearchCondition](#dialog.SearchCondition) | repeated | &#34;Or&#34; query |






<a name="dialog.SearchPeerCondition"></a>

### SearchPeerCondition
Serch Peer condition


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |






<a name="dialog.SearchPeerContentType"></a>

### SearchPeerContentType
Search content type condition


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| content_type | [SearchContentType](#dialog.SearchContentType) |  |  |






<a name="dialog.SearchPeerTypeCondition"></a>

### SearchPeerTypeCondition
Search peer type condition


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer_type | [SearchPeerType](#dialog.SearchPeerType) |  |  |






<a name="dialog.SearchPieceText"></a>

### SearchPieceText
Search peer name condition


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| query | [string](#string) |  |  |






<a name="dialog.SearchSenderIdConfition"></a>

### SearchSenderIdConfition
Searching sender uid condition


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [int32](#int32) |  |  |






<a name="dialog.SimpleContactSearchCondition"></a>

### SimpleContactSearchCondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| text | [string](#string) |  |  |






<a name="dialog.SimpleGroupSearchCondition"></a>

### SimpleGroupSearchCondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| query_string | [string](#string) |  |  |






<a name="dialog.SimpleMessageSearchCondition"></a>

### SimpleMessageSearchCondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  | where to search |
| text | [string](#string) |  | search term |
| type | [SearchContentType](#dialog.SearchContentType) |  | content message type to search |
| search_direction | [SearchDirection](#dialog.SearchDirection) |  | search direction gt/lt |
| date_from | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | search message from |
| sender | [Peer](#dialog.Peer) |  | only search messages from specific sender |






<a name="dialog.SimplePeerSearchCondition"></a>

### SimplePeerSearchCondition
Search among contacts/groups/users


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer_type | [SearchPeerType](#dialog.SearchPeerType) |  |  |
| text | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.SimpleSearchCondition"></a>

### SimpleSearchCondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| contact | [SimpleContactSearchCondition](#dialog.SimpleContactSearchCondition) |  |  |
| message | [SimpleMessageSearchCondition](#dialog.SimpleMessageSearchCondition) |  |  |
| peer | [SimplePeerSearchCondition](#dialog.SimplePeerSearchCondition) |  |  |
| userProfile | [SimpleUserProfileSearchCondition](#dialog.SimpleUserProfileSearchCondition) |  |  |
| group | [SimpleGroupSearchCondition](#dialog.SimpleGroupSearchCondition) |  |  |






<a name="dialog.SimpleUserProfileSearchCondition"></a>

### SimpleUserProfileSearchCondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| query_string | [string](#string) |  |  |






<a name="dialog.UserMatch"></a>

### UserMatch



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_id | [int32](#int32) |  |  |
| match_predicates | [bool](#bool) |  |  |






<a name="dialog.criterion"></a>

### criterion






 


<a name="dialog.SearchContentType"></a>

### SearchContentType


| Name | Number | Description |
| ---- | ------ | ----------- |
| SEARCHCONTENTTYPE_UNKNOWN | 0 |  |
| SEARCHCONTENTTYPE_ANY | 1 |  |
| SEARCHCONTENTTYPE_TEXT | 2 |  |
| SEARCHCONTENTTYPE_LINKS | 3 |  |
| SEARCHCONTENTTYPE_DOCUMENTS | 4 |  |
| SEARCHCONTENTTYPE_MEDIA | 5 | photo and video |
| SEARCHCONTENTTYPE_AUDIO | 6 | voice |



<a name="dialog.SearchDirection"></a>

### SearchDirection


| Name | Number | Description |
| ---- | ------ | ----------- |
| SEARCHDIRECTION_UNKNOWN | 0 |  |
| SEARCHDIRECTION_FORWARD | 1 | gt |
| SEARCHDIRECTION_BACKWARD | 2 | lt |



<a name="dialog.SearchPeerType"></a>

### SearchPeerType


| Name | Number | Description |
| ---- | ------ | ----------- |
| SEARCHPEERTYPE_UNKNOWN | 0 |  |
| SEARCHPEERTYPE_GROUPS | 1 |  |
| SEARCHPEERTYPE_CONTACTS | 2 |  |
| SEARCHPEERTYPE_PUBLIC | 3 |  |


 

 


<a name="dialog.Search"></a>

### Search


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| PeerSearch | [RequestPeerSearch](#dialog.RequestPeerSearch) | [ResponsePeerSearch](#dialog.ResponsePeerSearch) | Search among groups/users/contacts |
| ResolvePeer | [RequestResolvePeer](#dialog.RequestResolvePeer) | [ResponseResolvePeer](#dialog.ResponseResolvePeer) |  |
| MessageSearch | [RequestMessageSearch](#dialog.RequestMessageSearch) | [ResponseMessageSearchResponse](#dialog.ResponseMessageSearchResponse) | Search by messages |
| MessageSearchMore | [RequestMessageSearchMore](#dialog.RequestMessageSearchMore) | [ResponseMessageSearchResponse](#dialog.ResponseMessageSearchResponse) |  |
| SimpleSearch | [RequestSimpleSearch](#dialog.RequestSimpleSearch) | [ResponseMessageSearchResponse](#dialog.ResponseMessageSearchResponse) | Custom search by conditions |
| SimpleSearchMore | [RequestSimpleSearchMore](#dialog.RequestSimpleSearchMore) | [ResponseMessageSearchResponse](#dialog.ResponseMessageSearchResponse) |  |
| AutocompleteSuggestions | [RequestFieldAutocomplete](#dialog.RequestFieldAutocomplete) | [ResponseFieldAutocomplete](#dialog.ResponseFieldAutocomplete) | Search for autocomplete suggestions among custom user profile |
| LoadUserSearchByPredicatesResults | [RequestLoadUserSearchByPredicatesResults](#dialog.RequestLoadUserSearchByPredicatesResults) | [ResponseLoadUserSearchByPredicatesResults](#dialog.ResponseLoadUserSearchByPredicatesResults) |  |
| LoadUserSearchByPredicatesCount | [RequestLoadUserSearchByPredicatesCount](#dialog.RequestLoadUserSearchByPredicatesCount) | [ResponseLoadUserSearchByPredicatesCount](#dialog.ResponseLoadUserSearchByPredicatesCount) |  |
| GetRecommendations | [RequestGetRecommendations](#dialog.RequestGetRecommendations) | [ResponseGetRecommendations](#dialog.ResponseGetRecommendations) |  |
| GetPromotedPeers | [RequestGetPromotedPeers](#dialog.RequestGetPromotedPeers) | [ResponseGetPromotedPeers](#dialog.ResponseGetPromotedPeers) |  |

 



<a name="sequence_and_updates.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## sequence_and_updates.proto



<a name="dialog.GroupMembersSubset"></a>

### GroupMembersSubset
Represents subset of group members


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |
| member_ids | [int32](#int32) | repeated |  |






<a name="dialog.PeersList"></a>

### PeersList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peers | [Peer](#dialog.Peer) | repeated |  |






<a name="dialog.RequestGetDialogsDifference"></a>

### RequestGetDialogsDifference
Getting difference of dialogs


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| clock | [int64](#int64) |  | max of the last action dates among all user&#39;s dialogs |






<a name="dialog.RequestGetDifference"></a>

### RequestGetDifference
Getting difference of sequence


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |
| config_hash | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |






<a name="dialog.RequestGetPartialPeerInfo"></a>

### RequestGetPartialPeerInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| groups | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |
| group_members | [GroupMembersSubset](#dialog.GroupMembersSubset) | repeated |  |






<a name="dialog.RequestGetReferencedEntitites"></a>

### RequestGetReferencedEntitites
Loading referenced entities


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [UserOutPeer](#dialog.UserOutPeer) | repeated | users needed |
| mids | [UUIDValue](#dialog.UUIDValue) | repeated | messages needed |
| group_members | [GroupMembersSubset](#dialog.GroupMembersSubset) | repeated | Group &#43; subset of members to return. For loading members of big groups by chunks. |
| groups | [GroupOutPeer](#dialog.GroupOutPeer) | repeated | groups needed |






<a name="dialog.RequestGetState"></a>

### RequestGetState
Get main sequence state


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| optimizations | [UpdateOptimization](#dialog.UpdateOptimization) | repeated |  |






<a name="dialog.RequestSubscribeFromGroupOnline"></a>

### RequestSubscribeFromGroupOnline
Removing subscription for groups online


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| groups | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |






<a name="dialog.RequestSubscribeFromOnline"></a>

### RequestSubscribeFromOnline
Removing subscription for users online


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |






<a name="dialog.RequestSubscribeToGroupOnline"></a>

### RequestSubscribeToGroupOnline
Subscribing for groups online


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| groups | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |
| send_users_id | [bool](#bool) |  | If set to true UpdateGroupOnline will return list of online users id. |






<a name="dialog.RequestSubscribeToOnline"></a>

### RequestSubscribeToOnline
Subscribing for users online


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |






<a name="dialog.ResponseGetDialogsDifference"></a>

### ResponseGetDialogsDifference
Dialogs &#43; peers and entities


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| dialogs | [Dialog](#dialog.Dialog) | repeated |  |
| group_peers | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |






<a name="dialog.ResponseGetDifference"></a>

### ResponseGetDifference
Updates happens after requested seq number &#43; related peers and entities


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  | seq of the last loaded update |
| state | [bytes](#bytes) |  |  |
| updates | [UpdateSeqUpdate](#dialog.UpdateSeqUpdate) | repeated |  |
| messages | [HistoryMessage](#dialog.HistoryMessage) | repeated |  |
| need_more | [bool](#bool) |  | false if all updates returned |
| users_refs | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| groups_refs | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |
| config | [Config](#dialog.Config) |  | user&#39;s config |
| config_hash | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |






<a name="dialog.ResponseGetPartialPeerInfo"></a>

### ResponseGetPartialPeerInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [UserPartialInfo](#dialog.UserPartialInfo) | repeated |  |
| groups | [GroupPartialInfo](#dialog.GroupPartialInfo) | repeated |  |






<a name="dialog.ResponseGetReferencedEntitites"></a>

### ResponseGetReferencedEntitites



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [User](#dialog.User) | repeated |  |
| groups | [Group](#dialog.Group) | repeated |  |
| messages | [HistoryMessage](#dialog.HistoryMessage) | repeated |  |






<a name="dialog.SeqUpdateBox"></a>

### SeqUpdateBox
Container which contains UpdateSeqUpdate


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |
| update | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | UpdateSeqUpdate in bytes |
| unboxed_update | [UpdateSeqUpdate](#dialog.UpdateSeqUpdate) |  |  |






<a name="dialog.UpdateCombinedUpdate"></a>

### UpdateCombinedUpdate
Combined update


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq_start | [int32](#int32) |  | start of related sequence intervals |
| seq_end | [int32](#int32) |  | end of related sequence intervals |
| state | [bytes](#bytes) |  |  |
| users | [User](#dialog.User) | repeated | related users |
| groups | [Group](#dialog.Group) | repeated | related groups |
| updates | [UpdateContainer](#dialog.UpdateContainer) | repeated |  |
| messages | [HistoryMessage](#dialog.HistoryMessage) | repeated | related messages |






<a name="dialog.UpdateContainer"></a>

### UpdateContainer
Update container


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| update_header | [int32](#int32) |  |  |
| update | [bytes](#bytes) |  |  |






<a name="dialog.UpdateEmptyUpdate"></a>

### UpdateEmptyUpdate
Empty update






<a name="dialog.UpdateFatSeqUpdate"></a>

### UpdateFatSeqUpdate
Fat sequence update with additional data


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |
| update_header | [int32](#int32) |  |  |
| update | [bytes](#bytes) |  |  |
| users | [User](#dialog.User) | repeated | related users |
| groups | [Group](#dialog.Group) | repeated | related groups |






<a name="dialog.UpdateRawUpdate"></a>

### UpdateRawUpdate
Custom Raw Update


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| bytes | [bytes](#bytes) |  |  |






<a name="dialog.UpdateSeqUpdate"></a>

### UpdateSeqUpdate
Sequence update


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seq | [int32](#int32) |  |  |
| state | [bytes](#bytes) |  |  |
| update_header | [int32](#int32) |  |  |
| updateForceReloadState | [UpdateForceReloadState](#dialog.UpdateForceReloadState) |  |  |
| updateUserAvatarChanged | [UpdateUserAvatarChanged](#dialog.UpdateUserAvatarChanged) |  |  |
| updateUserNameChanged | [UpdateUserNameChanged](#dialog.UpdateUserNameChanged) |  |  |
| updateUserLocalNameChanged | [UpdateUserLocalNameChanged](#dialog.UpdateUserLocalNameChanged) |  |  |
| updateUserContactsChanged | [UpdateUserContactsChanged](#dialog.UpdateUserContactsChanged) |  |  |
| updateUserNickChanged | [UpdateUserNickChanged](#dialog.UpdateUserNickChanged) |  |  |
| updateUserAboutChanged | [UpdateUserAboutChanged](#dialog.UpdateUserAboutChanged) |  |  |
| updateUserPreferredLanguagesChanged | [UpdateUserPreferredLanguagesChanged](#dialog.UpdateUserPreferredLanguagesChanged) |  |  |
| updateUserTimeZoneChanged | [UpdateUserTimeZoneChanged](#dialog.UpdateUserTimeZoneChanged) |  |  |
| updateUserBotCommandsChanged | [UpdateUserBotCommandsChanged](#dialog.UpdateUserBotCommandsChanged) |  |  |
| updateUserExtChanged | [UpdateUserExtChanged](#dialog.UpdateUserExtChanged) |  |  |
| updateUserFullExtChanged | [UpdateUserFullExtChanged](#dialog.UpdateUserFullExtChanged) |  |  |
| updateUserSexChanged | [UpdateUserSexChanged](#dialog.UpdateUserSexChanged) |  |  |
| updateUserCustomProfileChanged | [UpdateUserCustomProfileChanged](#dialog.UpdateUserCustomProfileChanged) |  |  |
| updateUserStatusChanged | [UpdateUserStatusChanged](#dialog.UpdateUserStatusChanged) |  |  |
| updateContactRegistered | [UpdateContactRegistered](#dialog.UpdateContactRegistered) |  |  |
| updateContactsAdded | [UpdateContactsAdded](#dialog.UpdateContactsAdded) |  |  |
| updateContactsAddTaskSuspended | [UpdateContactsAddTaskSuspended](#dialog.UpdateContactsAddTaskSuspended) |  |  |
| updateContactsRemoved | [UpdateContactsRemoved](#dialog.UpdateContactsRemoved) |  |  |
| updateUserBlocked | [UpdateUserBlocked](#dialog.UpdateUserBlocked) |  |  |
| updateUserUnblocked | [UpdateUserUnblocked](#dialog.UpdateUserUnblocked) |  |  |
| updateInteractiveMediaEvent | [UpdateInteractiveMediaEvent](#dialog.UpdateInteractiveMediaEvent) |  |  |
| updateMessage | [UpdateMessage](#dialog.UpdateMessage) |  |  |
| updateMessageContentChanged | [UpdateMessageContentChanged](#dialog.UpdateMessageContentChanged) |  |  |
| updateMessageSent | [UpdateMessageSent](#dialog.UpdateMessageSent) |  |  |
| updateMessageReceived | [UpdateMessageReceived](#dialog.UpdateMessageReceived) |  |  |
| updateMessageRead | [UpdateMessageRead](#dialog.UpdateMessageRead) |  |  |
| updateMessageReadByMe | [UpdateMessageReadByMe](#dialog.UpdateMessageReadByMe) |  |  |
| updateMessageDelete | [UpdateMessageDelete](#dialog.UpdateMessageDelete) |  |  |
| updateChatClear | [UpdateChatClear](#dialog.UpdateChatClear) |  |  |
| updateChatDelete | [UpdateChatDelete](#dialog.UpdateChatDelete) |  |  |
| updateChatArchive | [UpdateChatArchive](#dialog.UpdateChatArchive) |  |  |
| updateChatGroupsChanged | [UpdateChatGroupsChanged](#dialog.UpdateChatGroupsChanged) |  |  |
| updateReactionsUpdate | [UpdateReactionsUpdate](#dialog.UpdateReactionsUpdate) |  |  |
| updateDialogFavouriteChanged | [UpdateDialogFavouriteChanged](#dialog.UpdateDialogFavouriteChanged) |  |  |
| updatePinnedMessagesChanged | [UpdatePinnedMessagesChanged](#dialog.UpdatePinnedMessagesChanged) |  |  |
| updateGroupTitleChanged | [UpdateGroupTitleChanged](#dialog.UpdateGroupTitleChanged) |  |  |
| updateGroupAvatarChanged | [UpdateGroupAvatarChanged](#dialog.UpdateGroupAvatarChanged) |  |  |
| updateGroupAboutChanged | [UpdateGroupAboutChanged](#dialog.UpdateGroupAboutChanged) |  |  |
| updateGroupOwnerChanged | [UpdateGroupOwnerChanged](#dialog.UpdateGroupOwnerChanged) |  |  |
| updateGroupMembersUpdated | [UpdateGroupMembersUpdated](#dialog.UpdateGroupMembersUpdated) |  |  |
| updateGroupMemberDiff | [UpdateGroupMemberDiff](#dialog.UpdateGroupMemberDiff) |  |  |
| updateGroupMembersCountChanged | [UpdateGroupMembersCountChanged](#dialog.UpdateGroupMembersCountChanged) |  |  |
| updateGroupMemberPermissionsChanged | [UpdateGroupMemberPermissionsChanged](#dialog.UpdateGroupMemberPermissionsChanged) |  |  |
| updateGroupInviteObsolete | [UpdateGroupInviteObsolete](#dialog.UpdateGroupInviteObsolete) |  |  |
| updateGroupUserInvitedObsolete | [UpdateGroupUserInvitedObsolete](#dialog.UpdateGroupUserInvitedObsolete) |  |  |
| updateGroupUserLeaveObsolete | [UpdateGroupUserLeaveObsolete](#dialog.UpdateGroupUserLeaveObsolete) |  |  |
| updateGroupUserKickObsolete | [UpdateGroupUserKickObsolete](#dialog.UpdateGroupUserKickObsolete) |  |  |
| updateGroupMembersUpdateObsolete | [UpdateGroupMembersUpdateObsolete](#dialog.UpdateGroupMembersUpdateObsolete) |  |  |
| updateGroupTitleChangedObsolete | [UpdateGroupTitleChangedObsolete](#dialog.UpdateGroupTitleChangedObsolete) |  |  |
| updateGroupAboutChangedObsolete | [UpdateGroupAboutChangedObsolete](#dialog.UpdateGroupAboutChangedObsolete) |  |  |
| updateGroupAvatarChangedObsolete | [UpdateGroupAvatarChangedObsolete](#dialog.UpdateGroupAvatarChangedObsolete) |  |  |
| updateGroupShortnameChanged | [UpdateGroupShortnameChanged](#dialog.UpdateGroupShortnameChanged) |  |  |
| updateStickerCollectionsChanged | [UpdateStickerCollectionsChanged](#dialog.UpdateStickerCollectionsChanged) |  |  |
| updateStickerPackRemoved | [UpdateStickerPackRemoved](#dialog.UpdateStickerPackRemoved) |  |  |
| updateStickerPackAdded | [UpdateStickerPackAdded](#dialog.UpdateStickerPackAdded) |  |  |
| updateTyping | [UpdateTyping](#dialog.UpdateTyping) |  |  |
| updateTypingStop | [UpdateTypingStop](#dialog.UpdateTypingStop) |  |  |
| updateUserOnline | [UpdateUserOnline](#dialog.UpdateUserOnline) |  |  |
| updateUserOffline | [UpdateUserOffline](#dialog.UpdateUserOffline) |  |  |
| updateUserLastSeen | [UpdateUserLastSeen](#dialog.UpdateUserLastSeen) |  |  |
| updateGroupOnline | [UpdateGroupOnline](#dialog.UpdateGroupOnline) |  |  |
| updateEventBusDeviceConnected | [UpdateEventBusDeviceConnected](#dialog.UpdateEventBusDeviceConnected) |  |  |
| updateEventBusDeviceDisconnected | [UpdateEventBusDeviceDisconnected](#dialog.UpdateEventBusDeviceDisconnected) |  |  |
| updateEventBusMessage | [UpdateEventBusMessage](#dialog.UpdateEventBusMessage) |  |  |
| updateEventBusDisposed | [UpdateEventBusDisposed](#dialog.UpdateEventBusDisposed) |  |  |
| updateIncomingCallDeprecated | [UpdateIncomingCallDeprecated](#dialog.UpdateIncomingCallDeprecated) |  |  |
| updateIncomingCall | [UpdateIncomingCall](#dialog.UpdateIncomingCall) |  |  |
| updateCallHandled | [UpdateCallHandled](#dialog.UpdateCallHandled) |  |  |
| updateCallDisposed | [UpdateCallDisposed](#dialog.UpdateCallDisposed) |  |  |
| updateParameterChanged | [UpdateParameterChanged](#dialog.UpdateParameterChanged) |  |  |
| updateRawUpdate | [UpdateRawUpdate](#dialog.UpdateRawUpdate) |  |  |
| updateEmptyUpdate | [UpdateEmptyUpdate](#dialog.UpdateEmptyUpdate) |  |  |
| updateCountersChanged | [UpdateCountersChanged](#dialog.UpdateCountersChanged) |  |  |
| updateConfig | [UpdateConfig](#dialog.UpdateConfig) |  |  |
| updateSpaceModified | [UpdateSpaceModified](#dialog.UpdateSpaceModified) |  |  |
| updateSpaceMemberModified | [UpdateSpaceMemberModified](#dialog.UpdateSpaceMemberModified) |  |  |
| updateMessageRejectedByHook | [UpdateMessageRejectedByHook](#dialog.UpdateMessageRejectedByHook) |  |  |
| updateMessageEditRejectedByHook | [UpdateMessageEditRejectedByHook](#dialog.UpdateMessageEditRejectedByHook) |  |  |
| updateUser | [UpdateUser](#dialog.UpdateUser) |  |  |
| updateFeatureFlagChanged | [UpdateFeatureFlagChanged](#dialog.UpdateFeatureFlagChanged) |  |  |
| updateThreadCreated | [UpdateThreadCreated](#dialog.UpdateThreadCreated) |  |  |
| updateThreadLifted | [UpdateThreadLifted](#dialog.UpdateThreadLifted) |  |  |
| updateGroup | [UpdateGroup](#dialog.UpdateGroup) |  |  |
| updateGroupMemberInvited | [UpdateGroupMemberInvited](#dialog.UpdateGroupMemberInvited) |  |  |
| messageReactionsUpdate | [reactions.MessageReactionsUpdate](#dialog.reactions.MessageReactionsUpdate) |  |  |
| updatePermissionsChange | [UpdatePermissionsChange](#dialog.UpdatePermissionsChange) |  |  |
| updateGroupTyping | [UpdateGroupTyping](#dialog.UpdateGroupTyping) |  |  |
| updateDialogReadLaterChanged | [UpdateDialogReadLaterChanged](#dialog.UpdateDialogReadLaterChanged) |  |  |






<a name="dialog.UpdateSeqUpdateTooLong"></a>

### UpdateSeqUpdateTooLong
Notification about requiring performing manual GetDifference






<a name="dialog.UpdateWeakFatUpdate"></a>

### UpdateWeakFatUpdate
Fat Weak Update


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| date | [int64](#int64) |  |  |
| update_header | [int32](#int32) |  |  |
| update | [bytes](#bytes) |  |  |
| users | [User](#dialog.User) | repeated |  |
| groups | [Group](#dialog.Group) | repeated |  |






<a name="dialog.UpdateWeakUpdate"></a>

### UpdateWeakUpdate
Out of sequence update (for typing and online statuses)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| date | [int64](#int64) |  |  |
| update_header | [int32](#int32) |  |  |
| update | [bytes](#bytes) |  |  |






<a name="dialog.WeakUpdateBox"></a>

### WeakUpdateBox



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| typing | [UpdateTyping](#dialog.UpdateTyping) |  |  |
| typing_stop | [UpdateTypingStop](#dialog.UpdateTypingStop) |  |  |
| user_last_seen | [UpdateUserLastSeen](#dialog.UpdateUserLastSeen) |  |  |
| group_online | [UpdateGroupOnline](#dialog.UpdateGroupOnline) |  |  |
| force_reload | [WeakUpdateBox.UpdateForceReloadState](#dialog.WeakUpdateBox.UpdateForceReloadState) |  |  |
| permissions_change | [UpdatePermissionsChange](#dialog.UpdatePermissionsChange) |  |  |
| user_status_change | [UpdateUserStatusChanged](#dialog.UpdateUserStatusChanged) |  |  |
| message_reaction_update | [reactions.MessageReactionsUpdate](#dialog.reactions.MessageReactionsUpdate) |  |  |
| message | [UpdateMessage](#dialog.UpdateMessage) |  |  |
| message_content_change | [UpdateMessageContentChanged](#dialog.UpdateMessageContentChanged) |  |  |
| message_read | [UpdateMessageRead](#dialog.UpdateMessageRead) |  |  |
| message_received | [UpdateMessageReceived](#dialog.UpdateMessageReceived) |  |  |
| message_read_by_me | [UpdateMessageReadByMe](#dialog.UpdateMessageReadByMe) |  |  |
| user_online | [UpdateUserOnline](#dialog.UpdateUserOnline) |  |  |
| group_typing | [UpdateGroupTyping](#dialog.UpdateGroupTyping) |  |  |
| mini_app | [UpdateMiniApp](#dialog.UpdateMiniApp) |  |  |
| event | [events.UpdateEvent](#dialog.events.UpdateEvent) |  |  |






<a name="dialog.WeakUpdateBox.UpdateForceReloadState"></a>

### WeakUpdateBox.UpdateForceReloadState



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fields | [WeakUpdateBox.UpdateForceReloadState.ForceReloadField](#dialog.WeakUpdateBox.UpdateForceReloadState.ForceReloadField) | repeated |  |






<a name="dialog.WeakUpdateBox.UpdateForceReloadState.ForceReloadField"></a>

### WeakUpdateBox.UpdateForceReloadState.ForceReloadField



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| reload_dialogs | [google.protobuf.Empty](#google.protobuf.Empty) |  |  |
| reload_contacts | [google.protobuf.Empty](#google.protobuf.Empty) |  |  |
| reload_history | [PeersList](#dialog.PeersList) |  |  |






<a name="dialog.WeakUpdateCommand"></a>

### WeakUpdateCommand



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| change_my_online | [WeakUpdateCommand.ChangeMyOnline](#dialog.WeakUpdateCommand.ChangeMyOnline) |  |  |
| subscribe_to_onlines | [WeakUpdateCommand.SubscribeToOnlines](#dialog.WeakUpdateCommand.SubscribeToOnlines) |  |  |
| unsubscribe_from_onlines | [PeersList](#dialog.PeersList) |  |  |
| unsubscribe_from_all_onlines | [google.protobuf.Empty](#google.protobuf.Empty) |  |  |
| change_my_typing | [WeakUpdateCommand.ChangeMyTyping](#dialog.WeakUpdateCommand.ChangeMyTyping) |  |  |
| subscribe_to_typings | [PeersList](#dialog.PeersList) |  |  |
| unsubscribe_from_typings | [PeersList](#dialog.PeersList) |  |  |
| unsubscribe_from_all_typings | [google.protobuf.Empty](#google.protobuf.Empty) |  |  |






<a name="dialog.WeakUpdateCommand.ChangeMyOnline"></a>

### WeakUpdateCommand.ChangeMyOnline



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| online | [bool](#bool) |  |  |
| timeout | [int64](#int64) |  | offline after timeout |
| device_type | [DeviceType](#dialog.DeviceType) |  |  |






<a name="dialog.WeakUpdateCommand.ChangeMyTyping"></a>

### WeakUpdateCommand.ChangeMyTyping



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| type | [TypingType](#dialog.TypingType) |  |  |
| start | [bool](#bool) |  |  |






<a name="dialog.WeakUpdateCommand.SubscribeToOnlines"></a>

### WeakUpdateCommand.SubscribeToOnlines



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peers | [PeersList](#dialog.PeersList) |  |  |
| send_users_id | [bool](#bool) |  |  |





 

 

 


<a name="dialog.SequenceAndUpdates"></a>

### SequenceAndUpdates


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetState | [RequestGetState](#dialog.RequestGetState) | [ResponseSeq](#dialog.ResponseSeq) | Get last seq number |
| GetDifference | [RequestGetDifference](#dialog.RequestGetDifference) | [ResponseGetDifference](#dialog.ResponseGetDifference) | Get all update that happens after given seq number |
| GetDialogsDifference | [RequestGetDialogsDifference](#dialog.RequestGetDialogsDifference) | [ResponseGetDialogsDifference](#dialog.ResponseGetDialogsDifference) | Load all dialogs that changed after given date |
| GetReferencedEntitites | [RequestGetReferencedEntitites](#dialog.RequestGetReferencedEntitites) | [ResponseGetReferencedEntitites](#dialog.ResponseGetReferencedEntitites) | Load some required entities |
| GetPartialPeerInfo | [RequestGetPartialPeerInfo](#dialog.RequestGetPartialPeerInfo) | [ResponseGetPartialPeerInfo](#dialog.ResponseGetPartialPeerInfo) |  |
| SubscribeToOnline | [RequestSubscribeToOnline](#dialog.RequestSubscribeToOnline) | [ResponseVoid](#dialog.ResponseVoid) |  |
| SubscribeFromOnline | [RequestSubscribeFromOnline](#dialog.RequestSubscribeFromOnline) | [ResponseVoid](#dialog.ResponseVoid) |  |
| SubscribeToGroupOnline | [RequestSubscribeToGroupOnline](#dialog.RequestSubscribeToGroupOnline) | [ResponseVoid](#dialog.ResponseVoid) |  |
| SubscribeFromGroupOnline | [RequestSubscribeFromGroupOnline](#dialog.RequestSubscribeFromGroupOnline) | [ResponseVoid](#dialog.ResponseVoid) |  |
| SeqUpdates | [.google.protobuf.Empty](#google.protobuf.Empty) | [SeqUpdateBox](#dialog.SeqUpdateBox) stream | Get stream of the user&#39;s updates |
| WeakUpdates | [WeakUpdateCommand](#dialog.WeakUpdateCommand) stream | [WeakUpdateBox](#dialog.WeakUpdateBox) stream |  |

 



<a name="spaces.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## spaces.proto



<a name="dialog.RequestCreateSpace"></a>

### RequestCreateSpace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| request_id | [int64](#int64) |  |  |
| title | [string](#string) |  |  |
| shortname | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| avatar | [Avatar](#dialog.Avatar) |  |  |






<a name="dialog.RequestDeleteSpace"></a>

### RequestDeleteSpace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.RequestGetSpaceInviteUrl"></a>

### RequestGetSpaceInviteUrl



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |






<a name="dialog.RequestLoadSpaces"></a>

### RequestLoadSpaces







<a name="dialog.RequestRevokeSpaceInviteUrl"></a>

### RequestRevokeSpaceInviteUrl



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |






<a name="dialog.RequestSetAbout"></a>

### RequestSetAbout



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.RequestSetAvatar"></a>

### RequestSetAvatar



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |
| file_location | [FileLocation](#dialog.FileLocation) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.RequestSetShortname"></a>

### RequestSetShortname



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |
| shortname | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.RequestSetTitle"></a>

### RequestSetTitle



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |
| title | [string](#string) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.RequestSpaceInvite"></a>

### RequestSpaceInvite



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |
| user_id | [int32](#int32) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.RequestSpaceKick"></a>

### RequestSpaceKick



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |
| user_id | [int32](#int32) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.RequestSpaceLeave"></a>

### RequestSpaceLeave



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |
| user_id | [int32](#int32) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.RequestStreamSpaceMembers"></a>

### RequestStreamSpaceMembers



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| space_id | [UUIDValue](#dialog.UUIDValue) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.ResponseLoadSpaces"></a>

### ResponseLoadSpaces



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| space | [Space](#dialog.Space) | repeated |  |
| owner_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |






<a name="dialog.ResponseSpace"></a>

### ResponseSpace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| space | [Space](#dialog.Space) |  |  |






<a name="dialog.ResponseSpaceInviteUrl"></a>

### ResponseSpaceInviteUrl



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| invite_url | [string](#string) |  |  |






<a name="dialog.ResponseSpaceMember"></a>

### ResponseSpaceMember



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| space_id | [UUIDValue](#dialog.UUIDValue) |  |  |
| member | [SpaceMember](#dialog.SpaceMember) |  |  |






<a name="dialog.Space"></a>

### Space



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [UUIDValue](#dialog.UUIDValue) |  |  |
| created_at | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| general | [Space.General](#dialog.Space.General) |  |  |
| public | [Space.Public](#dialog.Space.Public) |  |  |
| private | [Space.Private](#dialog.Space.Private) |  |  |
| title | [string](#string) |  |  |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| avatar | [Avatar](#dialog.Avatar) |  |  |
| deleted_at | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.Space.General"></a>

### Space.General







<a name="dialog.Space.Private"></a>

### Space.Private



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| owner_user_id | [int32](#int32) |  |  |






<a name="dialog.Space.Public"></a>

### Space.Public



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| owner_user_id | [int32](#int32) |  |  |
| shortname | [string](#string) |  |  |






<a name="dialog.SpaceMember"></a>

### SpaceMember



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| space_id | [UUIDValue](#dialog.UUIDValue) |  |  |
| user_id | [int32](#int32) |  |  |
| invited_at | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| joined_at | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| deleted_at | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| clock | [DataClock](#dialog.DataClock) |  |  |






<a name="dialog.SpaceMemberWithPeer"></a>

### SpaceMemberWithPeer



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| member | [SpaceMember](#dialog.SpaceMember) |  |  |
| peer | [UserOutPeer](#dialog.UserOutPeer) |  |  |






<a name="dialog.UpdateSpaceMemberModified"></a>

### UpdateSpaceMemberModified



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| member | [SpaceMember](#dialog.SpaceMember) |  |  |






<a name="dialog.UpdateSpaceModified"></a>

### UpdateSpaceModified



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| space | [Space](#dialog.Space) |  |  |





 

 

 


<a name="dialog.Spaces"></a>

### Spaces


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateSpace | [RequestCreateSpace](#dialog.RequestCreateSpace) | [ResponseSpace](#dialog.ResponseSpace) |  |
| DeleteSpace | [RequestDeleteSpace](#dialog.RequestDeleteSpace) | [ResponseSpace](#dialog.ResponseSpace) |  |
| SetTitle | [RequestSetTitle](#dialog.RequestSetTitle) | [ResponseSpace](#dialog.ResponseSpace) |  |
| SetShortname | [RequestSetShortname](#dialog.RequestSetShortname) | [ResponseSpace](#dialog.ResponseSpace) |  |
| SetAbout | [RequestSetAbout](#dialog.RequestSetAbout) | [ResponseSpace](#dialog.ResponseSpace) |  |
| SetAvatar | [RequestSetAvatar](#dialog.RequestSetAvatar) | [ResponseSpace](#dialog.ResponseSpace) |  |
| LoadSpaces | [RequestLoadSpaces](#dialog.RequestLoadSpaces) | [ResponseLoadSpaces](#dialog.ResponseLoadSpaces) |  |
| LoadSpaceMembers | [RequestStreamSpaceMembers](#dialog.RequestStreamSpaceMembers) | [SpaceMemberWithPeer](#dialog.SpaceMemberWithPeer) stream |  |
| Invite | [RequestSpaceInvite](#dialog.RequestSpaceInvite) | [ResponseSpaceMember](#dialog.ResponseSpaceMember) |  |
| Kick | [RequestSpaceKick](#dialog.RequestSpaceKick) | [ResponseSpaceMember](#dialog.ResponseSpaceMember) |  |
| Leave | [RequestSpaceLeave](#dialog.RequestSpaceLeave) | [ResponseSpaceMember](#dialog.ResponseSpaceMember) |  |
| GetSpaceInviteUrl | [RequestGetSpaceInviteUrl](#dialog.RequestGetSpaceInviteUrl) | [ResponseSpaceInviteUrl](#dialog.ResponseSpaceInviteUrl) |  |
| RevokeSpaceInviteUrl | [RequestRevokeSpaceInviteUrl](#dialog.RequestRevokeSpaceInviteUrl) | [ResponseSpaceInviteUrl](#dialog.ResponseSpaceInviteUrl) |  |

 



<a name="stickers.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## stickers.proto



<a name="dialog.RequestAddStickerCollection"></a>

### RequestAddStickerCollection
Adding sticker collection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| title | [string](#string) |  |  |






<a name="dialog.RequestAddStickerPackReference"></a>

### RequestAddStickerPackReference
Add a reference to other user&#39;s sticker pack


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| source_sticker_pack | [int32](#int32) |  |  |






<a name="dialog.RequestLoadAcesssibleStickers"></a>

### RequestLoadAcesssibleStickers
Load accessible stickers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| from_clock | [int64](#int64) |  |  |






<a name="dialog.RequestLoadOwnStickers"></a>

### RequestLoadOwnStickers
Loading own stickers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| from_clock | [int64](#int64) |  |  |






<a name="dialog.RequestLoadStickerCollection"></a>

### RequestLoadStickerCollection
Loading stickers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  |  |






<a name="dialog.RequestRemoveStickerCollection"></a>

### RequestRemoveStickerCollection
Removing sticker collection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  |  |






<a name="dialog.RequestRemoveStickerPackReference"></a>

### RequestRemoveStickerPackReference
Remove a reference to an other user&#39;s sticker pack


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| source_sticker_pack | [int32](#int32) |  |  |






<a name="dialog.ResponseLoadAcesssibleStickers"></a>

### ResponseLoadAcesssibleStickers



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| accessible_stickers | [StickerCollection](#dialog.StickerCollection) | repeated |  |
| removed_collections | [StickerCollection](#dialog.StickerCollection) | repeated |  |
| clock | [int64](#int64) |  |  |
| prev_clock | [int64](#int64) |  |  |






<a name="dialog.ResponseLoadOwnStickers"></a>

### ResponseLoadOwnStickers



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| own_stickers | [StickerCollection](#dialog.StickerCollection) | repeated |  |
| removed_collections | [StickerCollection](#dialog.StickerCollection) | repeated |  |
| clock | [int64](#int64) |  |  |
| prev_clock | [int64](#int64) |  |  |






<a name="dialog.ResponseLoadStickerCollection"></a>

### ResponseLoadStickerCollection



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| collection | [StickerCollection](#dialog.StickerCollection) |  |  |






<a name="dialog.ResponseStickersResponse"></a>

### ResponseStickersResponse
Stickers response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| collections | [StickerCollection](#dialog.StickerCollection) | repeated |  |
| seq | [int32](#int32) |  | deprecated |
| state | [bytes](#bytes) |  |  |
| removed_collections | [StickerCollection](#dialog.StickerCollection) | repeated |  |
| clock | [int64](#int64) |  |  |
| prev_clock | [int64](#int64) |  |  |






<a name="dialog.StickerCollection"></a>

### StickerCollection
Sticker collection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  | Unique id of a collection |
| title | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Sticker pack title |
| stickers | [StickerDescriptor](#dialog.StickerDescriptor) | repeated |  |
| owned_by_me | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | does this pack belongs to current user |
| clock | [int64](#int64) |  |  |






<a name="dialog.StickerDescriptor"></a>

### StickerDescriptor
Descriptor of a Sticker


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  | Sticker unique id |
| emoji | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Emoji code for sticker |
| image_128 | [ImageLocation](#dialog.ImageLocation) |  | Image of sticker 128x128 in WebP format |
| image_512 | [ImageLocation](#dialog.ImageLocation) |  | Image of sticker 512x512 in WebP format |
| image_256 | [ImageLocation](#dialog.ImageLocation) |  | Image of sticker 256x256 in WebP format |
| animatedStickerJson | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Animated sticker json payload |






<a name="dialog.UpdateStickerCollectionsChanged"></a>

### UpdateStickerCollectionsChanged
Sticker collection changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| updated_collections | [StickerCollection](#dialog.StickerCollection) | repeated |  |






<a name="dialog.UpdateStickerPackAdded"></a>

### UpdateStickerPackAdded
Sticker pack was added


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pack | [StickerCollection](#dialog.StickerCollection) |  |  |






<a name="dialog.UpdateStickerPackRemoved"></a>

### UpdateStickerPackRemoved
Sticker pack removed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pack_id | [int32](#int32) |  |  |





 

 

 


<a name="dialog.Stickers"></a>

### Stickers


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| LoadOwnStickers | [RequestLoadOwnStickers](#dialog.RequestLoadOwnStickers) | [ResponseLoadOwnStickers](#dialog.ResponseLoadOwnStickers) |  |
| LoadAcesssibleStickers | [RequestLoadAcesssibleStickers](#dialog.RequestLoadAcesssibleStickers) | [ResponseLoadAcesssibleStickers](#dialog.ResponseLoadAcesssibleStickers) |  |
| AddStickerPackReference | [RequestAddStickerPackReference](#dialog.RequestAddStickerPackReference) | [ResponseSeq](#dialog.ResponseSeq) |  |
| RemoveStickerPackReference | [RequestRemoveStickerPackReference](#dialog.RequestRemoveStickerPackReference) | [ResponseSeq](#dialog.ResponseSeq) |  |
| AddStickerCollection | [RequestAddStickerCollection](#dialog.RequestAddStickerCollection) | [ResponseSeq](#dialog.ResponseSeq) |  |
| RemoveStickerCollection | [RequestRemoveStickerCollection](#dialog.RequestRemoveStickerCollection) | [ResponseSeq](#dialog.ResponseSeq) |  |
| LoadStickerCollection | [RequestLoadStickerCollection](#dialog.RequestLoadStickerCollection) | [ResponseLoadStickerCollection](#dialog.ResponseLoadStickerCollection) |  |

 



<a name="threads.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## threads.proto



<a name="dialog.RequestCreateThread"></a>

### RequestCreateThread
Create a threaded conversation inside a group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| random_id | [int64](#int64) |  | random request id for query deduplication |
| parent_group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  | parent group where thread is created |
| start_message_id | [UUIDValue](#dialog.UUIDValue) |  | message from where thread starts |
| title | [string](#string) |  | thread title |
| join_policy | [RequestCreateThread.JoinPolicy](#dialog.RequestCreateThread.JoinPolicy) |  | thread join policy: for all group members or invite only |
| members | [UserOutPeer](#dialog.UserOutPeer) | repeated | members |






<a name="dialog.RequestJoinThread"></a>

### RequestJoinThread
Join public thread


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent_group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  | parent group where thread is created |
| thread_group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  | group representing thread about to be joined |






<a name="dialog.RequestLiftThread"></a>

### RequestLiftThread
Converts thread into a group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| random_id | [int64](#int64) |  | Id for query deduplication |
| parent_group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  | parent group where thread is created |
| thread_group_peer | [GroupOutPeer](#dialog.GroupOutPeer) |  | group representing thread about to be lifted |
| title | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | lifted group title |






<a name="dialog.RequestLoadGroupThreads"></a>

### RequestLoadGroupThreads
Load group threads available for user


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [GroupOutPeer](#dialog.GroupOutPeer) |  |  |






<a name="dialog.ResponseCreateThread"></a>

### ResponseCreateThread
Thread creation response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| thread_group | [Group](#dialog.Group) |  | group, representing thread internally |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated | corresponding user peers. empty if dropped by optimizations |






<a name="dialog.ResponseLiftThread"></a>

### ResponseLiftThread
Thread lift response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [Group](#dialog.Group) |  | group, representing lifted group |






<a name="dialog.ResponseLoadGroupThreads"></a>

### ResponseLoadGroupThreads



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| threads | [ThreadReference](#dialog.ThreadReference) | repeated |  |






<a name="dialog.ThreadReference"></a>

### ThreadReference



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message_id | [UUIDValue](#dialog.UUIDValue) |  |  |
| peer | [OutPeer](#dialog.OutPeer) |  |  |





 


<a name="dialog.RequestCreateThread.JoinPolicy"></a>

### RequestCreateThread.JoinPolicy


| Name | Number | Description |
| ---- | ------ | ----------- |
| INVITE_ONLY | 0 |  |
| THREAD_MEMBERS | 1 |  |


 

 


<a name="dialog.Threads"></a>

### Threads


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateThread | [RequestCreateThread](#dialog.RequestCreateThread) | [ResponseCreateThread](#dialog.ResponseCreateThread) |  |
| LiftThread | [RequestLiftThread](#dialog.RequestLiftThread) | [ResponseLiftThread](#dialog.ResponseLiftThread) |  |
| LoadGroupThreads | [RequestLoadGroupThreads](#dialog.RequestLoadGroupThreads) | [ResponseLoadGroupThreads](#dialog.ResponseLoadGroupThreads) |  |
| JoinThread | [RequestJoinThread](#dialog.RequestJoinThread) | [ResponseVoid](#dialog.ResponseVoid) |  |

 



<a name="users.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## users.proto



<a name="dialog.BotCommand"></a>

### BotCommand
Available bot commands


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| slash_command | [string](#string) |  | Slash command name (wihtout slash) |
| description | [string](#string) |  | Slash command description |
| loc_key | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Optional Localization Key for i18n |






<a name="dialog.ContactRecord"></a>

### ContactRecord
Contact information record


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [ContactType](#dialog.ContactType) |  |  |
| type_spec | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Value for specification type of contact, for example &#39;mobile/standalone/office&#39; for phones or &#39;vk/fb/telegram&#39; for extenrnal networks. |
| string_value | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| long_value | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |
| title | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| subtitle | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.FullUser"></a>

### FullUser
Full User representation - deprecated


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  | User&#39;s id |
| contact_info | [ContactRecord](#dialog.ContactRecord) | repeated |  |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| preferred_languages | [string](#string) | repeated |  |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Time Zone of user in TZ format |
| bot_commands | [BotCommand](#dialog.BotCommand) | repeated |  |
| is_blocked | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| custom_profile | [string](#string) |  | custom user profile info in JSON format |
| integration_token | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| status | [UserStatus](#dialog.UserStatus) |  |  |






<a name="dialog.RequestEditUserLocalName"></a>

### RequestEditUserLocalName
Renaming of user&#39;s visible name


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| access_hash | [int64](#int64) |  |  |
| name | [string](#string) |  |  |






<a name="dialog.RequestLoadFullUsers"></a>

### RequestLoadFullUsers
Loading Full User information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_peers | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |






<a name="dialog.RequestLoadUserData"></a>

### RequestLoadUserData



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| claims | [RequestLoadUserData.Claim](#dialog.RequestLoadUserData.Claim) | repeated |  |






<a name="dialog.RequestLoadUserData.Claim"></a>

### RequestLoadUserData.Claim



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_peer | [Peer](#dialog.Peer) |  |  |
| p2p | [bool](#bool) |  | load data about user in p2p conversation |
| group_member | [Peer](#dialog.Peer) |  | load data about group member by group peer if requested user and client are both group members |
| contact | [bool](#bool) |  | load data about user if this user is in the client&#39;s contacts |
| message_sender | [UUIDValue](#dialog.UUIDValue) |  | load data about group message sender by messageId if this message is accessible for the client |






<a name="dialog.ResponseLoadFullUsers"></a>

### ResponseLoadFullUsers



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| full_users | [FullUser](#dialog.FullUser) | repeated |  |






<a name="dialog.ResponseLoadUserData"></a>

### ResponseLoadUserData



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [User](#dialog.User) | repeated |  |






<a name="dialog.UpdateUser"></a>

### UpdateUser



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  |  |
| data | [UserData](#dialog.UserData) |  |  |






<a name="dialog.UpdateUserAboutChanged"></a>

### UpdateUserAboutChanged
Update about user&#39;s about changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.UpdateUserAvatarChanged"></a>

### UpdateUserAvatarChanged
Update about avatar changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| avatar | [Avatar](#dialog.Avatar) |  |  |






<a name="dialog.UpdateUserBotCommandsChanged"></a>

### UpdateUserBotCommandsChanged
Update about bot commands changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| commands | [BotCommand](#dialog.BotCommand) | repeated |  |






<a name="dialog.UpdateUserContactsChanged"></a>

### UpdateUserContactsChanged
Update about contact information change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| contact_records | [ContactRecord](#dialog.ContactRecord) | repeated |  |






<a name="dialog.UpdateUserCustomProfileChanged"></a>

### UpdateUserCustomProfileChanged
Update about user custom profile changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| custom_profile | [string](#string) |  | custom user profile info in JSON format |






<a name="dialog.UpdateUserExtChanged"></a>

### UpdateUserExtChanged



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| ext | [RecursiveMapValue](#dialog.RecursiveMapValue) |  |  |






<a name="dialog.UpdateUserFullExtChanged"></a>

### UpdateUserFullExtChanged



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| ext | [RecursiveMapValue](#dialog.RecursiveMapValue) |  |  |






<a name="dialog.UpdateUserLocalNameChanged"></a>

### UpdateUserLocalNameChanged
Update about local name changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| local_name | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.UpdateUserNameChanged"></a>

### UpdateUserNameChanged
Update about name changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| name | [string](#string) |  |  |






<a name="dialog.UpdateUserNickChanged"></a>

### UpdateUserNickChanged
Update about nick changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| nickname | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.UpdateUserPreferredLanguagesChanged"></a>

### UpdateUserPreferredLanguagesChanged
Update about user&#39;s preferred languages


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| preferred_languages | [string](#string) | repeated |  |






<a name="dialog.UpdateUserSexChanged"></a>

### UpdateUserSexChanged
Update about user sex changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| sex | [Sex](#dialog.Sex) |  |  |






<a name="dialog.UpdateUserStatusChanged"></a>

### UpdateUserStatusChanged
Update about user status change


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| status | [UserStatus](#dialog.UserStatus) |  |  |






<a name="dialog.UpdateUserTimeZoneChanged"></a>

### UpdateUserTimeZoneChanged
User TimeZone changed


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [int32](#int32) |  |  |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.User"></a>

### User



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  | User&#39;s id |
| access_hash | [int64](#int64) |  |  |
| data | [UserData](#dialog.UserData) |  | required |






<a name="dialog.UserData"></a>

### UserData
Main user object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| nick | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| sex | [Sex](#dialog.Sex) |  |  |
| avatar | [Avatar](#dialog.Avatar) |  |  |
| is_bot | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| status | [UserData.Lifecycle](#dialog.UserData.Lifecycle) |  |  |
| user_status | [UserStatus](#dialog.UserStatus) |  |  |
| time_zone | [string](#string) |  |  |
| exts | [UserData.Ext](#dialog.UserData.Ext) | repeated |  |
| obsoleteClock | [DataClock](#dialog.DataClock) |  | deprecated |
| locales | [string](#string) | repeated |  |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| contact_info | [ContactRecord](#dialog.ContactRecord) | repeated |  |
| bot_commands | [BotCommand](#dialog.BotCommand) | repeated |  |
| custom_profile | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| hint | [UserData.Hint](#dialog.UserData.Hint) |  | This parameter intended just to show in UI (client shouldn&#39;t base any logic on that) |
| was_authorized | [bool](#bool) |  |  |
| clock | [int64](#int64) |  |  |






<a name="dialog.UserData.Ext"></a>

### UserData.Ext



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| s | [string](#string) |  |  |
| b | [bool](#bool) |  |  |






<a name="dialog.UserPartialInfo"></a>

### UserPartialInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  |  |
| access_hash | [int64](#int64) |  |  |
| clock | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| nick | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| avatar | [Avatar](#dialog.Avatar) |  |  |






<a name="dialog.UserProfile"></a>

### UserProfile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user | [User](#dialog.User) |  |  |
| contact_info | [ContactRecord](#dialog.ContactRecord) | repeated |  |
| about | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |
| preferred_languages | [string](#string) | repeated |  |
| time_zone | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Time Zone of user in TZ format |
| bot_commands | [BotCommand](#dialog.BotCommand) | repeated |  |
| custom_profile | [string](#string) |  | custom user profile info in JSON format |
| integration_token | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.UserStatus"></a>

### UserStatus
User&#39;s status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [UserStatusType](#dialog.UserStatusType) |  |  |
| text | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Text supplied by user |
| clock | [int64](#int64) |  |  |





 


<a name="dialog.ContactType"></a>

### ContactType


| Name | Number | Description |
| ---- | ------ | ----------- |
| CONTACTTYPE_UNKNOWN | 0 |  |
| CONTACTTYPE_PHONE | 1 |  |
| CONTACTTYPE_EMAIL | 2 |  |
| CONTACTTYPE_WEB | 3 |  |
| CONTACTTYPE_SOCIAL | 4 |  |



<a name="dialog.Sex"></a>

### Sex


| Name | Number | Description |
| ---- | ------ | ----------- |
| SEX_UNKNOWN | 0 |  |
| SEX_MALE | 2 |  |
| SEX_FEMALE | 3 |  |



<a name="dialog.UserData.Hint"></a>

### UserData.Hint


| Name | Number | Description |
| ---- | ------ | ----------- |
| user_hint_regular | 0 |  |
| user_hint_guest | 1 |  |



<a name="dialog.UserData.Lifecycle"></a>

### UserData.Lifecycle


| Name | Number | Description |
| ---- | ------ | ----------- |
| MISSED | 0 |  |
| ACTIVE | 1 |  |
| DELETED | 2 |  |
| BLOCKED | 3 |  |
| BLOCKED_AND_DELETED | 4 |  |



<a name="dialog.UserStatusType"></a>

### UserStatusType


| Name | Number | Description |
| ---- | ------ | ----------- |
| USERSTATUSTYPE_UNKNOWN | 0 |  |
| USERSTATUSTYPE_UNSET | 1 |  |
| USERSTATUSTYPE_AWAY | 2 |  |
| USERSTATUSTYPE_DONOTDISTURB | 3 |  |
| USERSTATUSTYPE_INVISIBLE | 4 |  |
| USERSTATUSTYPE_BUSY | 5 |  |


 

 


<a name="dialog.Users"></a>

### Users


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| EditUserLocalName | [RequestEditUserLocalName](#dialog.RequestEditUserLocalName) | [ResponseSeq](#dialog.ResponseSeq) |  |
| LoadFullUsers | [RequestLoadFullUsers](#dialog.RequestLoadFullUsers) | [ResponseLoadFullUsers](#dialog.ResponseLoadFullUsers) | Deprecated |
| LoadUserData | [RequestLoadUserData](#dialog.RequestLoadUserData) | [ResponseLoadUserData](#dialog.ResponseLoadUserData) |  |

 



<a name="web_rtc.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## web_rtc.proto



<a name="dialog.ActiveCall"></a>

### ActiveCall
Active Calls. Used in broadcasting states of current calls.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |
| peer | [Peer](#dialog.Peer) |  | Call&#39;s peer |
| call_members | [CallMember](#dialog.CallMember) | repeated | Call Members |






<a name="dialog.AdvertiseMaster"></a>

### AdvertiseMaster
Sent by master


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| server | [ICEServer](#dialog.ICEServer) | repeated | a list of ICE servers |
| call_api_version | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | a verison of the call signaling |
| call_name | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.AdvertisePeer"></a>

### AdvertisePeer
Peer advertisement


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device_id | [int64](#int64) |  | device id of the peer |
| peer_settings | [PeerSettings](#dialog.PeerSettings) |  | settings for the peer |
| ice_servers | [ICEServer](#dialog.ICEServer) | repeated | ice servers for the peer |






<a name="dialog.AdvertiseSelf"></a>

### AdvertiseSelf
Advertizing self to a master mode


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer_settings | [PeerSettings](#dialog.PeerSettings) |  | Optional peer Settings |






<a name="dialog.Answer"></a>

### Answer
Answer signal


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_id | [int64](#int64) |  | Session Id of answer |
| sdp | [string](#string) |  | Answer SDP |






<a name="dialog.CallLogEntry"></a>

### CallLogEntry
This struct represents a call from the history


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  | call id |
| call_date | [int64](#int64) |  |  |
| initiator | [OutPeer](#dialog.OutPeer) |  |  |
| recipient | [OutPeer](#dialog.OutPeer) |  |  |
| duration | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  |  |
| answered | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | was the call answered by anybody |
| finished | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |
| display_name | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | optional display name for this call |
| rejected | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  |  |






<a name="dialog.CallMember"></a>

### CallMember
Call Member


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_id | [int32](#int32) |  | Member User Id |
| state | [CallMemberStateHolder](#dialog.CallMemberStateHolder) |  | State of member |






<a name="dialog.CallMemberStateHolder"></a>

### CallMemberStateHolder
Call Member state holder


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| state | [CallMemberState](#dialog.CallMemberState) |  | State Value |
| fallback_is_ringing | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Fallback flag for future compatibility of state |
| fallback_is_connected | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Fallback flag for future compatibility of state |
| fallback_is_connecting | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Fallback flag for future compatibility of state |
| fallback_is_ringing_reached | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Fallback flag for future compatibility of state |
| fallback_is_ended | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Fallback flag for future compatibility of state |






<a name="dialog.CallNameChanged"></a>

### CallNameChanged
Used to notify participants about call name changes


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_name | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.CallStats"></a>

### CallStats
Used to send call statistics to the server


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [CallStatsType](#dialog.CallStatsType) |  | the type of the event |
| value | [string](#string) |  | the value of the event |






<a name="dialog.Candidate"></a>

### Candidate
Candidate signal


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_id | [int64](#int64) |  | Session Id of candidate |
| index | [int32](#int32) |  | Index of candidate |
| id | [string](#string) |  | Id of candidate |
| sdp | [string](#string) |  | SDP of candidate |






<a name="dialog.CloseSession"></a>

### CloseSession
Close this session and be ready to


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [int64](#int64) |  | Device Id |
| session_id | [int64](#int64) |  | Session Id for renegotiation |






<a name="dialog.DTMF"></a>

### DTMF
Emulates DTMF key press


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| code | [DTMFCode](#dialog.DTMFCode) |  |  |
| duration | [int64](#int64) |  | the duration (in milliseconds) |






<a name="dialog.EnableConnection"></a>

### EnableConnection
Notification about enabling connection to peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [int64](#int64) |  | Device Id |
| session_id | [int64](#int64) |  | Session Id |






<a name="dialog.GotICECandidate"></a>

### GotICECandidate
WebRTC IceCandidate add signal.
Used to let the other party know about new ICE candidate, usually from onIceCandidate callback of WebRTC


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_id | [int64](#int64) |  |  |
| candidate | [ICECandidate](#dialog.ICECandidate) |  |  |






<a name="dialog.ICECandidate"></a>

### ICECandidate
Structure representing an ICE candidate


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sdp_m_line_index | [int32](#int32) |  |  |
| sdp_mid | [string](#string) |  |  |
| sdp | [string](#string) |  |  |






<a name="dialog.ICEServer"></a>

### ICEServer
ICE Server description


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| url | [string](#string) |  | Url to server |
| username | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Optional username |
| credential | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Optional credential |






<a name="dialog.NeedDisconnect"></a>

### NeedDisconnect
Notification about requirement about required disconnection from peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [int64](#int64) |  | Device Id |






<a name="dialog.NeedOffer"></a>

### NeedOffer
Notification from master that offer is required


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [int64](#int64) |  | Destination Device Id |
| session_id | [int64](#int64) |  | Session Id |
| peer_settings | [PeerSettings](#dialog.PeerSettings) |  | Deprecated peer settings |






<a name="dialog.NegotinationSuccessful"></a>

### NegotinationSuccessful
Notification about on negotiation is successful


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [int64](#int64) |  | Device Id |
| session_id | [int64](#int64) |  | Session Id |






<a name="dialog.Offer"></a>

### Offer
Offer signal


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_id | [int64](#int64) |  | Session Id of offer |
| sdp | [string](#string) |  | Offer SDP |
| peer_settings | [PeerSettings](#dialog.PeerSettings) |  | Deprecated Own Peer settings |






<a name="dialog.OnRenegotiationNeeded"></a>

### OnRenegotiationNeeded
Need renegotiate session. For example when streams are changed.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [int64](#int64) |  | Device Id |
| session_id | [int64](#int64) |  | Session Id |






<a name="dialog.PeerSettings"></a>

### PeerSettings
Peer Settings


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| can_pre_connect | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | If peer can preconnect before answer |
| sends_offer | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | The peer already has an offer. The server should request offer from this peer. |
| wait_for_candidates | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | Peer prefers to receive an offer/answer with ICE candidates collected |
| client_info | [ClientInfo](#dialog.ClientInfo) |  | Description of this peer. Version, browser, OS, type, etc. |






<a name="dialog.RemovedICECandidates"></a>

### RemovedICECandidates
WebRTC IceCandidate remove signal
Used to let the other party know about ICE candidate list change, usually from onIceCandidatesRemoved callback


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_id | [int64](#int64) |  |  |
| candidate | [ICECandidate](#dialog.ICECandidate) | repeated |  |






<a name="dialog.RequestChangeCallDisplayName"></a>

### RequestChangeCallDisplayName
Changes the call display name


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |
| display_name | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.RequestDeleteCall"></a>

### RequestDeleteCall



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |






<a name="dialog.RequestDoCall"></a>

### RequestDoCall
Do Call. Right after a call client need to start sending CallInProgress


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [OutPeer](#dialog.OutPeer) |  |  |
| timeout | [int64](#int64) |  |  |






<a name="dialog.RequestGetCallInfo"></a>

### RequestGetCallInfo
Getting Call Information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |






<a name="dialog.RequestJoinCall"></a>

### RequestJoinCall
Joining Call


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |






<a name="dialog.RequestLoadCalls"></a>

### RequestLoadCalls
Call this function to load call history


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| next_offset | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | Cursor |
| limit | [int32](#int32) |  |  |






<a name="dialog.RequestRejectCall"></a>

### RequestRejectCall
Rejecting Call


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |
| reason | [RejectCallReason](#dialog.RejectCallReason) |  |  |






<a name="dialog.ResponseDoCall"></a>

### ResponseDoCall



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |
| event_bus_id | [string](#string) |  |  |
| device_id | [int64](#int64) |  |  |






<a name="dialog.ResponseGetCallInfo"></a>

### ResponseGetCallInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [Peer](#dialog.Peer) |  |  |
| groups | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |
| users | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| event_bus_id | [string](#string) |  |  |
| display_name | [google.protobuf.StringValue](#google.protobuf.StringValue) |  |  |






<a name="dialog.ResponseLoadCalls"></a>

### ResponseLoadCalls
Calls &#43; related peers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| calls | [CallLogEntry](#dialog.CallLogEntry) | repeated |  |
| users | [UserOutPeer](#dialog.UserOutPeer) | repeated |  |
| groups | [GroupOutPeer](#dialog.GroupOutPeer) | repeated |  |
| next_offset | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  |  |






<a name="dialog.UpdateCallDisposed"></a>

### UpdateCallDisposed
Update about the call ending (all participants have left)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |
| attempt_index | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| reason | [CallDisposedReason](#dialog.CallDisposedReason) |  |  |






<a name="dialog.UpdateCallHandled"></a>

### UpdateCallHandled
Update about incoming call handled


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |
| attempt_index | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |






<a name="dialog.UpdateIncomingCall"></a>

### UpdateIncomingCall
A new update about incoming call


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |
| event_bus_id | [string](#string) |  |  |
| peer | [Peer](#dialog.Peer) |  |  |
| display_name | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | Call visual name |
| attempt_index | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |
| out_peer | [OutPeer](#dialog.OutPeer) |  |  |
| video | [bool](#bool) |  |  |






<a name="dialog.UpdateIncomingCallDeprecated"></a>

### UpdateIncomingCallDeprecated
Update about incoming call (Sent every 10 seconds)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| call_id | [int64](#int64) |  |  |
| attempt_index | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  |  |






<a name="dialog.WebRTCSignaling"></a>

### WebRTCSignaling



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| advertiseSelf | [AdvertiseSelf](#dialog.AdvertiseSelf) |  |  |
| advertiseMaster | [AdvertiseMaster](#dialog.AdvertiseMaster) |  |  |
| advertisePeer | [AdvertisePeer](#dialog.AdvertisePeer) |  |  |
| candidate | [Candidate](#dialog.Candidate) |  |  |
| gotICECandidate | [GotICECandidate](#dialog.GotICECandidate) |  |  |
| removedICECandidates | [RemovedICECandidates](#dialog.RemovedICECandidates) |  |  |
| offer | [Offer](#dialog.Offer) |  |  |
| answer | [Answer](#dialog.Answer) |  |  |
| needOffer | [NeedOffer](#dialog.NeedOffer) |  |  |
| negotinationSuccessful | [NegotinationSuccessful](#dialog.NegotinationSuccessful) |  |  |
| enableConnection | [EnableConnection](#dialog.EnableConnection) |  |  |
| onRenegotiationNeeded | [OnRenegotiationNeeded](#dialog.OnRenegotiationNeeded) |  |  |
| closeSession | [CloseSession](#dialog.CloseSession) |  |  |
| needDisconnect | [NeedDisconnect](#dialog.NeedDisconnect) |  |  |
| dTMF | [DTMF](#dialog.DTMF) |  |  |
| callStats | [CallStats](#dialog.CallStats) |  |  |
| callNameChanged | [CallNameChanged](#dialog.CallNameChanged) |  |  |





 


<a name="dialog.CallDisposedReason"></a>

### CallDisposedReason


| Name | Number | Description |
| ---- | ------ | ----------- |
| CALLDISPOSEDREASON_UNKNOWN | 0 |  |
| CALLDISPOSEDREASON_REJECTED | 1 |  |
| CALLDISPOSEDREASON_BUSY | 2 |  |
| CALLDISPOSEDREASON_ENDED | 3 |  |
| CALLDISPOSEDREASON_ANSWER_TIMEOUT | 4 |  |



<a name="dialog.CallMemberState"></a>

### CallMemberState


| Name | Number | Description |
| ---- | ------ | ----------- |
| CALLMEMBERSTATE_UNKNOWN | 0 |  |
| CALLMEMBERSTATE_RINGING | 1 |  |
| CALLMEMBERSTATE_RINGING_REACHED | 4 |  |
| CALLMEMBERSTATE_CONNECTING | 2 |  |
| CALLMEMBERSTATE_CONNECTED | 3 |  |
| CALLMEMBERSTATE_ENDED | 5 |  |



<a name="dialog.CallStatsType"></a>

### CallStatsType


| Name | Number | Description |
| ---- | ------ | ----------- |
| CALLSTATSTYPE_UNKNOWN | 0 |  |
| CALLSTATSTYPE_TURN_SERVER_ROUND_TRIP_TIME | 1 |  |
| CALLSTATSTYPE_ICE_CONNECTION_FAILED | 2 |  |
| CALLSTATSTYPE_ICE_CONNECTION_CONNECTED | 3 |  |
| CALLSTATSTYPE_ICE_CONNECTION_DID_NOT_CONNECT | 4 |  |
| CALLSTATSTYPE_ICE_CONNECTION_CONNECTED_TIME | 5 |  |
| CALLSTATSTYPE_PEER_CONNECTION_CREATE_ANSWER_FAILED | 6 |  |
| CALLSTATSTYPE_PEER_CONNECTION_CREATE_OFFER_FAILED | 7 |  |
| CALLSTATSTYPE_PEER_CONNECTION_SET_REMOTE_DESCRIPTION_FAILED | 8 |  |
| CALLSTATSTYPE_PEER_CONNECTION_SET_LOCAL_DESCRIPTION_FAILED | 9 |  |



<a name="dialog.DTMFCode"></a>

### DTMFCode


| Name | Number | Description |
| ---- | ------ | ----------- |
| DTMFCODE_UNKNOWN | 0 |  |
| DTMFCODE_ZERO | 1 |  |
| DTMFCODE_ONE | 2 |  |
| DTMFCODE_TWO | 3 |  |
| DTMFCODE_THREE | 4 |  |
| DTMFCODE_FOUR | 5 |  |
| DTMFCODE_FIVE | 6 |  |
| DTMFCODE_SIX | 7 |  |
| DTMFCODE_SEVEN | 8 |  |
| DTMFCODE_EIGHT | 9 |  |
| DTMFCODE_NINE | 10 |  |
| DTMFCODE_ASTERISK | 11 |  |
| DTMFCODE_POUND | 12 |  |
| DTMFCODE_A | 13 |  |
| DTMFCODE_B | 14 |  |
| DTMFCODE_C | 15 |  |
| DTMFCODE_D | 16 |  |



<a name="dialog.RejectCallReason"></a>

### RejectCallReason


| Name | Number | Description |
| ---- | ------ | ----------- |
| REJECTCALLREASON_UNKNOWN | 0 |  |
| REJECTCALLREASON_DECLINE | 1 |  |
| REJECTCALLREASON_BUSY | 2 |  |


 

 


<a name="dialog.WebRTC"></a>

### WebRTC


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetCallInfo | [RequestGetCallInfo](#dialog.RequestGetCallInfo) | [ResponseGetCallInfo](#dialog.ResponseGetCallInfo) |  |
| LoadCalls | [RequestLoadCalls](#dialog.RequestLoadCalls) | [ResponseLoadCalls](#dialog.ResponseLoadCalls) |  |
| DoCall | [RequestDoCall](#dialog.RequestDoCall) | [ResponseDoCall](#dialog.ResponseDoCall) |  |
| JoinCall | [RequestJoinCall](#dialog.RequestJoinCall) | [ResponseVoid](#dialog.ResponseVoid) |  |
| RejectCall | [RequestRejectCall](#dialog.RequestRejectCall) | [ResponseVoid](#dialog.ResponseVoid) |  |
| ChangeCallDisplayName | [RequestChangeCallDisplayName](#dialog.RequestChangeCallDisplayName) | [ResponseVoid](#dialog.ResponseVoid) |  |
| DeleteCall | [RequestDeleteCall](#dialog.RequestDeleteCall) | [ResponseVoid](#dialog.ResponseVoid) |  |

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

