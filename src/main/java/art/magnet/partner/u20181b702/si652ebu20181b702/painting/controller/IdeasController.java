package art.magnet.partner.u20181b702.si652ebu20181b702.painting.controller;

import art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.model.Idea;
import art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.service.IdeaService;
import art.magnet.partner.u20181b702.si652ebu20181b702.painting.resource.IdeaResource;
import art.magnet.partner.u20181b702.si652ebu20181b702.painting.resource.SaveIdeaResource;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class IdeasController {
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private IdeaService ideaService;

    @GetMapping("/ideas")
    public Page<IdeaResource> getAllIdea(Pageable pageable){
        Page<Idea> ideaPage = ideaService.getAllIdea(pageable);
        List<IdeaResource> resources = ideaPage.getContent().stream().map(this::convertToResource).collect(Collectors.toList());
        return new PageImpl<>(resources, pageable, resources.size());
    }

    @PostMapping("/ideas")
    public IdeaResource createIdea(@RequestBody @Valid SaveIdeaResource resource){
        return convertToResource(ideaService.createIdea(convertToEntity(resource)));
    }


    private Idea convertToEntity(SaveIdeaResource resource){
        return mapper.map(resource, Idea.class);
    }

    private IdeaResource convertToResource(Idea entity){
        return mapper.map(entity, IdeaResource.class);
    }
}
