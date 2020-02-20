package fr.tzoreol.votewatcher.controllers;

import com.google.gson.Gson;
import fr.tzoreol.votewatcher.daos.BureauRepository;
import fr.tzoreol.votewatcher.daos.ListeRepository;
import fr.tzoreol.votewatcher.daos.ScrutinRepository;
import fr.tzoreol.votewatcher.domain.Bureau;
import fr.tzoreol.votewatcher.domain.Liste;
import fr.tzoreol.votewatcher.domain.Scrutin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class DashboardController {

    @Autowired
    private ScrutinRepository scrutinRepository;

    @Autowired
    private BureauRepository bureauRepository;

    @Autowired
    private ListeRepository listeRepository;

    @GetMapping("/")
    public String main(Model model) {

        Iterable<Bureau> bureaux  = bureauRepository.findAll();
        model.addAttribute("bureaux", bureauRepository.findAll());

       List<Integer> exprimes = new ArrayList<>();
        for(Bureau bureau : bureaux) {
            exprimes.add(bureau.getId() - 1,scrutinRepository.recupererExprimesParBureau(bureau.getId()));
        }

        model.addAttribute("miseAJour", LocalDateTime.now());
        model.addAttribute("exprimes", exprimes);
        model.addAttribute("inscrits", scrutinRepository.recupererInscrits());
        model.addAttribute("votants", scrutinRepository.recupererVotants());
        model.addAttribute("blancs", scrutinRepository.recupererBlancs());
        model.addAttribute("nuls", scrutinRepository.recupererNuls());

        model.addAttribute("listes", listeRepository.recupererListesCandidates());
        model.addAttribute("scrutinRepository", scrutinRepository);

        model.addAttribute("totalInscrits", scrutinRepository.recupererTotalInscrits());
        model.addAttribute("totalVotants", scrutinRepository.recupererTotalVotants());
        model.addAttribute("totalBlancs", scrutinRepository.recupererTotalBlancs());
        model.addAttribute("totalNuls", scrutinRepository.recupererTotalNuls());
        model.addAttribute("totalExprimes", scrutinRepository.recupererTotalExprimes());

        return "dashboard";
    }
}