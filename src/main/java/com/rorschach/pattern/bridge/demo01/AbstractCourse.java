package com.rorschach.pattern.bridge.demo01;

import com.rorschach.pattern.bridge.demo01.course.ICourse;
import com.rorschach.pattern.bridge.demo01.note.INote;
import com.rorschach.pattern.bridge.demo01.video.IVideo;

/**
 * @author Rorschach
 * @date 2021-4-18 12:51
 */
public class AbstractCourse implements ICourse {

    private INote note;

    private IVideo video;

    public INote getNote() {
        return note;
    }

    public void setNote(INote note) {
        this.note = note;
    }

    public IVideo getVideo() {
        return video;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }
}
