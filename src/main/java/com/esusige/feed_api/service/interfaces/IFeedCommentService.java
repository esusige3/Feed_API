package com.esusige.feed_api.service.interfaces;

import com.esusige.feed_api.dto.FeedComment;
import com.esusige.feed_api.dto.FeedComment;

import java.util.List;

public interface IFeedCommentService {

    List<FeedComment> ListComments(Long feedId);
    boolean WriteComment(FeedComment feedComment,Long feedId);
    boolean DeleteComment(Long commentId);
    boolean ModifyComment(FeedComment comment, Long commentId);
    FeedComment CountComment(Long feedId);

}
