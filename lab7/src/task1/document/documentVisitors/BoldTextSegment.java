package task1.document.documentVisitors;

import task1.document.textSegments.DocumentVisitor;

public class BoldTextSegment extends TextSegment {
    BoldTextSegment(String content) {
        super(content);
    }

    @Override
    void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
