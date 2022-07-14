package art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.service;

import art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.model.Idea;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IdeaService {
    Page<Idea> getAllIdea(Pageable pageable);
    Idea createIdea(Idea idea);
}
