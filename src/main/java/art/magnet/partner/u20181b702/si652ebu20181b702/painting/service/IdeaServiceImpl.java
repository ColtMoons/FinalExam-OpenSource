package art.magnet.partner.u20181b702.si652ebu20181b702.painting.service;

import art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.model.Idea;
import art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.repository.IdeaRepository;
import art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.service.IdeaService;
import art.magnet.partner.u20181b702.si652ebu20181b702.shared.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IdeaServiceImpl implements IdeaService {

    @Autowired
    private IdeaRepository ideaRepository;

    @Override
    public Page<Idea> getAllIdea(Pageable pageable) {
        return ideaRepository.findAll(pageable);
    }

    @Override
    public Idea createIdea(Idea idea) {
        if (ideaRepository.existsIdeaByTextQueryAndAndAuthorId(idea.getTextQuery(), idea.getAuthorId())){
            throw new ResourceNotFoundException("Idea with textquery and author id already exist");
        }
        return ideaRepository.save(idea);
    }
}
