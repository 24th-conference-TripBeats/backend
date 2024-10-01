package team.tripbeats.backend.domain.tripRecommand.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestSurveyDto {
    private List<String> restaurant;
    private String requiredRestText;  // 스네이크 케이스로 수정
    private List<String> cafe;
}
