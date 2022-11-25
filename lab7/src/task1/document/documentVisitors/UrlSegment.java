package task1.document.documentVisitors;

import task1.document.textSegments.DocumentVisitor;

public class UrlSegment extends TextSegment {
    String url;
    String description;

    UrlSegment(String content) {
        super(content);
    }

    @Override
    void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
