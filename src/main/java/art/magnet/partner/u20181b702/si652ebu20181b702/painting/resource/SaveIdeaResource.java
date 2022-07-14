package art.magnet.partner.u20181b702.si652ebu20181b702.painting.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SaveIdeaResource {

    @NotNull
    @NotBlank
    private String textQuery;

    @NotNull
    private Integer initialSamples;

    @NotNull
    private Long authorId;
}
