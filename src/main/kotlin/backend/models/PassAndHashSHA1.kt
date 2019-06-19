package backend.models

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter
import lombok.ToString
import javax.persistence.*

@Setter
@Getter
@Entity
@Table(name = "passwordsandhashessha1")
@ToString
@AllArgsConstructor
data class PassAndHashSHA1(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sha1_id")
    val id: Int? = null,

    @Column(name = "sha1_password")
    val password: String? = null,

    @Column(name = "sha1_hash")
    val hash: String? = null
){

}