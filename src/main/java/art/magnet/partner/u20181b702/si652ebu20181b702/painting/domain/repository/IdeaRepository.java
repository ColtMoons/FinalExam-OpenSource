package art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.repository;

import art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.model.Idea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepository extends JpaRepository<Idea, Long> {
    Boolean existsIdeaByTextQueryAndAndAuthorId(String textQuery, Long authorId);
}
