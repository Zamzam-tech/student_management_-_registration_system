package com.student.management_system.Repository;

import com.student.management_system.Model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    
    // We add ONE custom method here to help with the "View registered courses" requirement.
    // Spring is smart: it sees "findByStudentId" and automatically writes the SQL 
    // to filter registrations by a specific student's ID.
    List<Registration> findByStudentId(Long studentId);
}
