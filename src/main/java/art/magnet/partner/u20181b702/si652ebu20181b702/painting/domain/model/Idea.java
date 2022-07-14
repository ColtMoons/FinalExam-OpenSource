package art.magnet.partner.u20181b702.si652ebu20181b702.painting.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ideas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Idea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String textQuery;

    @NotNull
    private Integer initialSamples;

    @NotNull
    private Long authorId;
}
