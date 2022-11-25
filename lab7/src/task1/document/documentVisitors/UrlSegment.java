package task1.document.documentVisitors;

import task1.document.textSegments.DocumentVisitor;

public class UrlSegment extends TextSegment {
    private String url;
    private String description;

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    UrlSegment(String content) {
        super(content);
    }

    public UrlSegment(String url, String description) {
        super(null);
        this.url = url;
        this.description = description;
    }

    @Override
    public StringBuilder accept(DocumentVisitor visitor) {
        return visitor.visit(this);
    }
}
