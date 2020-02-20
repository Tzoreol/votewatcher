package fr.tzoreol.votewatcher.controllers;

import fr.tzoreol.votewatcher.daos.BureauRepository;
import fr.tzoreol.votewatcher.daos.ListeRepository;
import fr.tzoreol.votewatcher.daos.ScrutinRepository;
import fr.tzoreol.votewatcher.domain.Bureau;
import fr.tzoreol.votewatcher.domain.Liste;
import fr.tzoreol.votewatcher.domain.Scrutin;
import fr.tzoreol.votewatcher.domain.ScrutinId;
import fr.tzoreol.votewatcher.dtos.ListeDto;
import fr.tzoreol.votewatcher.dtos.ResultsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UpdateController {

    @Autowired
    private BureauRepository bureauRepository;

    @Autowired
    private ListeRepository listeRepository;

    @Autowired
    private ScrutinRepository scrutinRepository;

    @GetMapping("/update")
    public String main(Model model) {

        List<Liste> listesCandidates = listeRepository.recupererListesCandidates();

        ResultsDto resultsDto = new ResultsDto();
        listesCandidates.forEach(liste -> resultsDto.ajouterListe(new ListeDto(liste)));

        model.addAttribute("bureaux", bureauRepository.findAll());
        model.addAttribute("resultsDto", resultsDto);

        return "update";
    }

    @PostMapping("/postResults")
    public RedirectView postResults(@ModelAttribute ResultsDto resultsDto) {
        enregistrerResultat(99, resultsDto.getBureau(), resultsDto.getInscrits());
        enregistrerResultat(98, resultsDto.getBureau(), resultsDto.getVotants());
        enregistrerResultat(97, resultsDto.getBureau(), resultsDto.getBlancs());
        enregistrerResultat(96, resultsDto.getBureau(), resultsDto.getNuls());

        resultsDto.getListesCandidates().forEach(liste -> {
            ScrutinId scrutinId = new ScrutinId();
            scrutinId.setBureau(resultsDto.getBureau());
            scrutinId.setListe(listeRepository.findById(liste.getListe().getId()).orElse(new Liste()));

            Scrutin scrutin = new Scrutin();
            scrutin.setScrutinId(scrutinId);
            scrutin.setVoix(liste.getNombreVoix());

            scrutinRepository.save(scrutin);
        });

        return new RedirectView("/");
    }

    private void enregistrerResultat(Integer idListe, Bureau bureau, Integer nombreVoix) {
        ScrutinId scrutinId = new ScrutinId();
        scrutinId.setBureau(bureau);
        scrutinId.setListe(listeRepository.findById(idListe).orElse(new Liste()));

        Scrutin scrutin = new Scrutin();
        scrutin.setScrutinId(scrutinId);
        scrutin.setVoix(nombreVoix);

        scrutinRepository.save(scrutin);
    }
}