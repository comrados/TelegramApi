package org.telegram.api.page.block;

import org.telegram.api.richtext.TLAbsRichText;
import org.telegram.tl.StreamingUtils;
import org.telegram.tl.TLContext;
import org.telegram.tl.TLObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Ruben Bermudez
 * @version 1.0
 */
public class TLPageBlockSubtitle extends TLObject {
    public static final int CLASS_ID = 0x8ffa9a1f;

    private TLAbsRichText text;

    public TLPageBlockSubtitle() {
        super();
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    public TLAbsRichText getText() {
        return text;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        StreamingUtils.writeTLObject(text, stream);
    }

    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        text = StreamingUtils.readTLObject(stream, context, TLAbsRichText.class);
    }

    @Override
    public String toString() {
        return "pageBlockSubtitle#8ffa9a1f";
    }
}
